/*
Copyright (c) 2011-2012 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.konkrit.extension

import org.sireum.extension._
import org.sireum.pilar.ast._
import org.sireum.pilar.eval._
import org.sireum.pilar.state._
import org.sireum.util._
import org.sireum.util.math._
import scala.annotation.meta.getter

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait KonkritLongValue extends IntegerValue with ConcreteValue {
  def value : Long
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object KonkritLongExtension extends ExtensionCompanion {
  def create[S](
    config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]]) =
    new KonkritLongBExtension(config)

  type Op = String

  import PilarAstUtil._

  @inline
  def binopASem(opA : Op)(c : Long, d : Long) =
    opA match {
      case ADD_BINOP  => c + d
      case SUB_BINOP  => c - d
      case MUL_BINOP  => c * d
      case DIV_BINOP  => c / d
      case REM_BINOP  => c % d
      case USHR_BINOP => c >>> d
      case SHR_BINOP  => c >> d
      case SHL_BINOP  => c << d
    }

  @inline
  private def opRSem(opR : Op)(c : Long, d : Long) =
    opR match {
      case EQ_BINOP => c == d
      case NE_BINOP => c != d
      case GT_BINOP => c > d
      case GE_BINOP => c >= d
      case LT_BINOP => c < d
      case LE_BINOP => c <= d
    }

  @inline
  private def unopASem(opA : Op)(c : Long) =
    opA match {
      case PLUS_UNOP  => c
      case MINUS_UNOP => -c
    }

  private type CV = KonkritLongValue
  private type V = Value

  import language.implicitConversions

  @inline
  private implicit def re2r[S](p : (S, V)) = ilist(p)

  @inline
  private implicit def long2v(n : Long) = CLong(n)

  @inline
  private implicit def cv2long(c : CV) = c.value

  @inline
  def nativeIndexConverter : V --> Integer = {
    case (v : CV) => SireumNumber(v)
  }

  @inline
  def defValue[S] : (S, ResourceUri) --> ISeq[(S, V)] = {
    case (s, IntegerExtension.Type) => (s, CLong(0))
  }

  @inline
  def cast[S] : (S, V, ResourceUri) --> ISeq[(S, V)] = {
    case (s, v : CV, IntegerExtension.Type)     => (s, v)
    case (s, v : CV, KonkritLongExtension.Type) => (s, v)
  }

  @inline
  def literal[S] : (S, Long) --> ISeq[(S, V)] = {
    case (s, n) => (s, CLong(n))
  }

  @inline
  def binopAEval[S] : (S, V, String, V) --> ISeq[(S, V)] = {
    case (s, c : CV, opA : String, d : CV) => (s, CLong(binopASem(opA)(c, d)))
  }

  @inline
  def binopREval[S](b2v : Boolean => V) : (S, V, String, V) --> ISeq[(S, V)] = {
    case (s, c : CV, opR : String, d : CV) => (s, b2v(opRSem(opR)(c, d)))
  }

  @inline
  def unopAEval[S] : (S, String, V) --> ISeq[(S, V)] = {
    case (s, opA, c : CV) => ilist((s, unopASem(opA)(c)))
  }

  @inline
  def cond[S](canCast : (S, V, ResourceUri) => Boolean,
              cast : (S, V, ResourceUri) --> ISeq[(S, V)]) : //
              (S, V) --> ISeq[(S, Boolean)] = {
    case (s, c : CV) => ilist((s, c.value != 0))
    case (s, v) if canCast(s, v, KonkritLongExtension.Type) =>
      for {
        (s1, v1) <- cast(s, v, KonkritLongExtension.Type)
      } yield (s1, v1.asInstanceOf[CV].value != 0)
  }

  @inline
  def b2v(b : Boolean) : V = if (b) CLong(1) else CLong(0)

  val Type = "pilar://typeext/" + UriUtil.classUri(this) + "/Type"

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  final case class CLong(value : Long) extends KonkritLongValue {
    val typeUri = KonkritLongExtension.Type
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait KonkritLongExtension[S]
    extends Extension[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]] {

  import KonkritLongExtension._

  val uriPath = UriUtil.classUri(this)

  @NativeIndex
  val nativeIndexConverter = KonkritLongExtension.nativeIndexConverter

  @DefaultValueProvider
  val defValue = KonkritLongExtension.defValue[S]

  @Cast
  val cast = KonkritLongExtension.cast[S]

  @Literal(classOf[Long])
  val literal = KonkritLongExtension.literal[S]

  import PilarAstUtil._

  @Binaries(Array(ADD_BINOP, SUB_BINOP, MUL_BINOP, DIV_BINOP, REM_BINOP,
    USHR_BINOP, SHR_BINOP, SHL_BINOP))
  val binopAEval = KonkritLongExtension.binopAEval[S]

  @Binaries(Array(EQ_BINOP, NE_BINOP, GT_BINOP, GE_BINOP, LT_BINOP, LE_BINOP))
  val binopREval = KonkritLongExtension.binopREval[S](b2v _)

  @Unaries(Array(PLUS_UNOP, MINUS_UNOP))
  val unopAEval = KonkritLongExtension.unopAEval[S]

  def b2v(b : Boolean) : V
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object KonkritLongBExtension extends ExtensionCompanion {
  def create[S](
    config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]]) =
    new KonkritLongBExtension(config)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class KonkritLongBExtension[S](
  config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]])
    extends KonkritLongExtension[S] {
  import KonkritBooleanExtension._

  def b2v(b : Boolean) = KonkritBooleanExtension.b2v(b)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object KonkritLongIExtension extends ExtensionCompanion {
  def create[S](
    config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]]) =
    new KonkritLongIExtension(config)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class KonkritLongIExtension[S](
  config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]])
    extends KonkritLongExtension[S] {
  import KonkritLongExtension._

  def b2v(b : Boolean) = KonkritLongExtension.b2v(b)

  val se = config.semanticsExtension

  @Cond
  val cond = KonkritLongExtension.cond(se.canCast, se.cast)
}
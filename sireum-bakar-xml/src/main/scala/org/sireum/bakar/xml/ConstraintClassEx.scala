package org.sireum.bakar.xml

import org.sireum.util._

object ConstraintClassEx {
  def unapply(o : org.sireum.bakar.xml.ConstraintClass) = {
    Some(
      o.getConstraint()
    )
  }
}
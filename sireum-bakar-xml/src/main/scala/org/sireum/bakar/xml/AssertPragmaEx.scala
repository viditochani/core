package org.sireum.bakar.xml

import org.sireum.util._

object AssertPragmaEx {
  def unapply(o : org.sireum.bakar.xml.AssertPragma) = {
    Some(
      o.getSloc(),
      o.getPragmaArgumentAssociationsQl(),
      o.getPragmaName()
    )
  }
}
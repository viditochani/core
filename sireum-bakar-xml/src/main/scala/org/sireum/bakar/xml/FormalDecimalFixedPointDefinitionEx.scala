package org.sireum.bakar.xml

import org.sireum.util._

object FormalDecimalFixedPointDefinitionEx {
  def unapply(o : org.sireum.bakar.xml.FormalDecimalFixedPointDefinition) = {
    Some(
      o.getSloc()
    )
  }
}
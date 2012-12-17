package org.sireum.bakar.xml.module

import scala.Array.apply
import org.sireum.bakar.xml.CompilationUnit
import org.sireum.option.PipelineMode.apply
import org.sireum.pipeline.gen.ModuleGenerator
import org.sireum.util.FileResourceUri
import org.sireum.util.MMap
import org.sireum.option.PipelineMode
import org.sireum.pipeline.Input
import org.sireum.pipeline.Produce

case class BakarVisitor (

    title : String = "Bakar Vistor",
    
    @Input
    parseGnat2XMLresults : MMap[FileResourceUri, CompilationUnit],
    
    @Produce
    results : Boolean
)

object hold2 {
  def main(args : Array[String]) {
    val opt = PipelineMode()
    opt.classNames = Array(BakarVisitor.getClass.getName.dropRight(1))
    opt.dir = "./src/main/scala/org/sireum/bakar/xml/module"
    opt.genClassName = "BakarVisitorModuleCore"

    ModuleGenerator.run(opt)
  }
} 
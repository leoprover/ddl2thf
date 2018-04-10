package leo.modules.embedding

import java.io._
import java.nio.file.{Files, Paths}

import org.antlr.v4.runtime.misc.ParseCancellationException

object DDL2THFLauncher {
  private final val usage: String =
    """
      |DDL2THF -- Encoding of Carmo/Jones DDL into HOL
      |(c) 2018 Alexander Steen
      |
      |Usage: ddl2thf <infile> [<outfile>]
      |
      |Parameters:
      |<infile>   - The file that contains a problem in DDL syntax.
      |             Use '-' (without quotes) to read from stdin.
      |<outfile>  - The file name in which the encoded result will be written
      |             (all parent directorys must already exist).
      |             If omitted, the result is printed to stdout.
    """.stripMargin

  def main(args: Array[String]): Unit = {
    if (args.length < 1 || args.length > 2) {
      println(usage)
    } else {
      try {
        val inPath0 = args(0)
        val inPath = Paths.get(inPath0).toAbsolutePath.normalize()
        val input: BufferedReader = if (inPath.toString == "-") {
          new BufferedReader(new InputStreamReader(System.in))
        } else if (!Files.exists(inPath)) { // It either does not exist or we cant access it
          throw new FileNotFoundException(s"The file '${inPath.toString}' cannot be read. Check if that file really exists.")
        } else {
          Files.newBufferedReader(inPath)
        }
        val embeddedProblem = DDLEmbedding(input)

        val output: Writer = if (args.length>1) {
          val outPath0 =  args(1)
          val outPath = Paths.get(outPath0).toAbsolutePath.normalize()
          new FileWriter(outPath.toFile)
        } else {
          new PrintWriter(System.out)
        }

        try {
          output.write(embeddedProblem)
        } finally {
          output.close()
        }
      } catch {
        case e: FileNotFoundException =>
          println(e.getMessage)
          sys.exit(1)
        case e: ParseCancellationException =>
          println(e.getMessage)
          sys.exit(1)
        case e: Exception =>
          println(e.toString)
          sys.exit(1)
      }
    }
  }
}

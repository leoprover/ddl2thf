import leo.modules.embedding.DDLEmbedding
import org.scalatest.funsuite.AnyFunSuite

class SimpleTest extends AnyFunSuite {
  test("test 1") {
    val input = "ddl(a, axiom, a)."
    val result = DDLEmbedding(input)
    println(result)
  }

  test("test 2") {
    val input =
      """
        |ddl(a, axiom, a).
        |ddl(b, axiom, $O(b)).
        |ddl(c, conjecture, $O(a/b)).
      """.stripMargin
    val result = DDLEmbedding(input)
    println(result)
  }
}

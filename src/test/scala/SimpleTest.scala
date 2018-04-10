import leo.modules.embedding.DDLEmbedding
import org.scalatest.FunSuite

class SimpleTest extends FunSuite {
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

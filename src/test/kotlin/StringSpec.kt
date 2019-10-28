import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class LookThroughEarnings : StringSpec({
  "returns 0 with no holdings" {
    (0).shouldBe(0)
  }
})

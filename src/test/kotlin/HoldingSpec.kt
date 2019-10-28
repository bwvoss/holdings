import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class HoldingSpec : StringSpec({
  "a DTO with the following data" {
    val holding = Holding("PM")

    (holding.ticker).shouldBe("PM")
  }
})

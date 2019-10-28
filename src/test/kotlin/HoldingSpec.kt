import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class HoldingSpec : StringSpec({
  "a DTO with the following data" {
    val holding = Holding("PM", 200, 528)

    (holding.ticker).shouldBe("PM")
    (holding.share_count).shouldBe(200)
    (holding.eps_cents).shouldBe(528)
  }
})

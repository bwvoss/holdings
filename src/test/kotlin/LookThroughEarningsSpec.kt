import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class LookThroughEarningsSpec : StringSpec({
  "calculates total" {
    val h1 = Holding("PM", 200, 528)
    val h2 = Holding("KHC", 140, 186)
    val h3 = Holding("WFC", 100, 431)

    val holdings = listOf<Holding>(h1, h2, h3);

    val lte = LookThroughEarnings(holdings)

    (lte.total_cents()).shouldBe(174740)
  }
})

class LookThroughEarnings(val holdings: List<Holding>) {
  fun total_cents(): Int {
    return holdings.map {
      it.share_count * it.eps_cents
    }.sum()
  }
}

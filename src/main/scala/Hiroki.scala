object Hiroki {
  def main(args: Array[String]): Unit = {
    println(reverse("uhh, reverse this..."))
    println(square(12))
  }

  def square(x: Int): Int = x * x

  def reverse(x: String): String = {
    var s = ""
    val chars = x.split("").reverse

    for(a <- chars) {
      s+=a
    }

    s
  }
}

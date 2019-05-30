package com.basketbandit.hiroki

import com.basketbandit.hiroki.functions.{ArithmeticFunctions, StringFunctions}

class Controller(a: Int, b: Int, c: String) extends ArithmeticFunctions with StringFunctions {
  println(square(a))
  println(root(b))
  println(reverse(c))
}

package com.basketbandit.hiroki

import com.basketbandit.hiroki.traits.{ArithmeticFunctions, Validator, StringFunctions}

class Controller() extends ArithmeticFunctions with StringFunctions with Validator {
  println(formatNumber(1000000))
  println(new SuperStringBuilder().append("o", 5).encase("A"))
}

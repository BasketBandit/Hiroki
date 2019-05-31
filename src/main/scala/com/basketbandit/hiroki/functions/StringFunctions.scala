package com.basketbandit.hiroki.functions

trait StringFunctions {

  def reverse(x: String): String = {
    var s = ""
    val chars = x.split("").reverse

    for(a <- chars) {
      s+=a
    }

    s
  }

  def prepend(string: String, x: String): String = x + string

  def append(string: String, x: String): String = string + x
}

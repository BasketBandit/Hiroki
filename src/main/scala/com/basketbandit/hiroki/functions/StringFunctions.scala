package com.basketbandit.hiroki.functions

trait StringFunctions extends Validator {

  def reverse(string: String): String = {
    var s = ""
    val chars = string.split("").reverse

    for(x <- chars) {
      s = s"$s$x"
    }

    s
  }

  def formatNumber(in: Int): String = formatNumber(in+"")

  def formatNumber(in: String): String = {
    if(!isNumber(in)) {
      return "NaN"
    }

    var s = ""
    val chars = in.toCharArray

    for(x <- 0 until chars.length) {
      if((chars.length - x) % 3 == 0 && x != 0) {
        s += ","
      }
      s += chars(x)
    }

    s
  }

  def prepend(string: String, x: String): String = s"$x$string"

  def append(string: String, x: String): String = s"$string$x"

  def encase(string: String, x: String): String = s"$x$string$x"


}

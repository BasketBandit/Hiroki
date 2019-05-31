package com.basketbandit.hiroki.functions

trait Validator {

  def isNumber(in: String): Boolean = {
    if(in.length < 1) {
      return false
    }
    
    for(x <- in.toStream; if !Character.isDigit(x)) {
      return false
    }
    
    true
  }

  def isNull(in: Any): Boolean = {
    in == null
  }

  def isTrue(in: Int): Boolean = isTrue(s"$in")

  def isTrue(in: String): Boolean = {
    in.toLowerCase match {
      case "true" => true
      case "1" => true
      case _ => false
    }
  }

  def isFalse(in: Int): Boolean = isFalse(s"$in")

  def isFalse(in: String): Boolean = {
    in.toLowerCase match {
      case "false" => true
      case "0" => true
      case _ => false
    }
  }


}

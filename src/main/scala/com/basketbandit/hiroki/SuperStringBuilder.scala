package com.basketbandit.hiroki

import com.basketbandit.hiroki.traits.StringFunctions

class SuperStringBuilder extends StringFunctions {
  var string: String = ""

  // Prepends the given string with `in`, `count` amount of times
  def prepend(in: String, count: Int = 1): SuperStringBuilder = {
    for(_ <- 1 to count) {
      this.string = prepend(this.string, in)
    }
    this
  }

  // Appends the given string with `in`, `count` amount of times
  def append(in: String, count: Int = 1): SuperStringBuilder = {
    for(_ <- 1 to count) {
      this.string = append(this.string, in)
    }
    this
  }

  // Encases the given string with `in`, `count` number of times
  def encase(in: String, count: Int = 1): SuperStringBuilder = {
    for(_ <- 1 to count) {
      this.string = encase(this.string, in)
    }
    this
  }

  override def toString: String = this.string
}

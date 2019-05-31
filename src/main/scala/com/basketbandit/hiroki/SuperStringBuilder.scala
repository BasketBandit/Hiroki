package com.basketbandit.hiroki

import com.basketbandit.hiroki.functions.StringFunctions

class SuperStringBuilder extends StringFunctions {
  var string: String = ""

  // Prepends the given string with `in`
  def prepend(in: String): SuperStringBuilder = {
    this.string = prepend(this.string, in)
    this
  }

  // Prepends the given string `count` amount of times
  def prepend(in: String, count: Int): SuperStringBuilder = {
    for(_ <- 1 to count) {
      this.string = prepend(this.string, in)
    }
    this
  }

  // Appends the given string with `in`
  def append(in: String): SuperStringBuilder = {
    this.string = append(this.string, in)
    this
  }

  // Appends the given string with `in`, `count` amount of times
  def append(in: String, count: Int): SuperStringBuilder = {
    for(_ <- 1 to count) {
      this.string = append(this.string, in)
    }
    this
  }

  override def toString: String = this.string
}

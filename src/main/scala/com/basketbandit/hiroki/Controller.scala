package com.basketbandit.hiroki

import com.basketbandit.hiroki.traits.{ArithmeticFunctions, StringFunctions, Validator}

class Controller() extends ArithmeticFunctions with StringFunctions with Validator {
  println(new OkHttpRequestHandler("https://nekos.life/api/v2/img/lewd").string)
}

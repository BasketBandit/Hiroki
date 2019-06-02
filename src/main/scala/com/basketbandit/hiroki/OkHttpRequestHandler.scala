package com.basketbandit.hiroki

import okhttp3.{OkHttpClient, Request, Response}

class OkHttpRequestHandler(in: String) {
  val client: OkHttpClient = new OkHttpClient
  val request: Request = new Request.Builder().url(in).build()
  val response: Response = client.newCall(request).execute()

  if(response.code() != 200) {
    println(new SuperStringBuilder().append(response.code() + "").append(": ").append(response.message()))
    response.close()
  }

  def string: String = {
    val string: String = response.body().string()
    response.close()
    string
  }

}

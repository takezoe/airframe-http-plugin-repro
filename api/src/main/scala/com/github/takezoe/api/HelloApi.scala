package com.github.takezoe.api

import wvlet.airframe.http.RPC

@RPC
trait HelloApi {
  def hello(): String
}

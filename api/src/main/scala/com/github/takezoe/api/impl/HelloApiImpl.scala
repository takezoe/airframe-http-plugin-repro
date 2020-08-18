package com.github.takezoe.api.impl

import com.github.takezoe.api.HelloApi

class HelloApiImpl extends HelloApi {
  override def hello(): String = "Hello!"
}

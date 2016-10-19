package com.packt

import org.scalatest.FunSuite

class HelloTests extends FunSuite {
  test("the name is set correctly in constructor") {
    assert(Hello.displaySalutation == "Hello World")
  }
}
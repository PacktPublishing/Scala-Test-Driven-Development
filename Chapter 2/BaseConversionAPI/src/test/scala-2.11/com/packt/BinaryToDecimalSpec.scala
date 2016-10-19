package com.packt

import org.scalatest.FlatSpec

class BinaryToDecimalSpec extends FlatSpec {
  "base conversion utility" should "convert binary number 100100111101 to decimal equivalent 2365" in {
    var decimal:Decimal = BaseConversion.bianryToDecimal(Binary("100100111101"))
    assert(decimal.number == "2365")
  }


  it should "convert binary number 11110001111110111 to decimal equivalent 123895" in {
    var decimal:Decimal = BaseConversion.bianryToDecimal(Binary("11110001111110111"))
    assert(decimal.number == "123895")
  }


  it should "convert binary number 100000000000001110000001 to decimal equivalent 8389505" in {
    var decimal:Decimal = BaseConversion.bianryToDecimal(Binary("100000000000001110000001"))
    assert(decimal.number == "8389505")
  }
}

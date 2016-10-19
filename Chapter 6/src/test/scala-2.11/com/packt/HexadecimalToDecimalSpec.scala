package com.packt

class HexadecimalToDecimalSpec extends UnitSpec {
  "base conversion utility" should "convert hexadecimal number AB to decimal equivalent 171" in {
    var decimal:Decimal = BaseConversion.hexadecimalToBinary(Hexadecimal("AB"))
    decimal.number shouldEqual "171"
  }


  it should "convert hexadecimal number 123AB to decimal equivalent 74667" in {
    var decimal:Decimal = BaseConversion.hexadecimalToBinary(Hexadecimal("123AB"))
    decimal.number shouldBe "74667"
  }


  it should "convert hexadecimal number ABCDEF to decimal equivalent 11259375" in {
    var decimal:Decimal = BaseConversion.hexadecimalToBinary(Hexadecimal("ABCDEF"))
    decimal.number should equal("11259375")
  }
}

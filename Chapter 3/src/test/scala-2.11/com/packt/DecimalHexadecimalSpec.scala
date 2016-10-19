package com.packt

class DecimalHexadecimalSpec extends UnitSpec {
  "base conversion utility" should "convert a number 1243 into a hexadecimal number 4DB" in {
    var hex: Hexadecimal = BaseConversion.decimalToHexadecimal(Decimal("1243"))
    hex.number should be ("4DB")
  }

  it should "convert a number 11111122 into a hexadecimal number A98AD2" in {
    var hex: Hexadecimal = BaseConversion.decimalToHexadecimal(Decimal("11111122"))
    hex.number should be ("A98AD2")
  }
}

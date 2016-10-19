package com.packt

class DecimalBinarySpec extends UnitSpec {
  "base conversion utility" should "convert a number 99 into a binary number 1100011" in {
    var binary: Binary = BaseConversion.decimalToBinary(Decimal("99"))
    assert(binary.number == "1100011")
  }

  it should "convert a number 245 into a binary number 11110101" in {
    var binary: Binary = BaseConversion.decimalToBinary(Decimal("245"))
    assert(binary.number == "11110101")
  }

  it should "convert a number 3141 into a binary number 110001000101" in {
    var binary: Binary = BaseConversion.decimalToBinary(Decimal("3141"))
    assert(binary.number == "110001000101")
  }
}

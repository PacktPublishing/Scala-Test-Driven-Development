package com.packt

class BeanSpec extends UnitSpec {
  "Decimal" should "throw error when initalised with a non numeric string" in {
    try {
      Decimal("XYZ")
    } catch {
      case e:IllegalArgumentException => assert(e.getMessage == "requirement failed: Unable to convert string to number")
      case _ =>fail
    }
  }

  "Binary" should "throw error when initalised with a non numeric string" in {
    intercept[IllegalArgumentException] {
      Binary("XYZ")
    }
  }

  "Hexadecimal" should "throw error when initalised with a non numeric string" in {
    intercept[IllegalArgumentException] {
      Hexadecimal("XYZ")
    }
  }
}

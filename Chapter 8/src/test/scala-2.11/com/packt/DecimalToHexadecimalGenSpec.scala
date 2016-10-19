package com.packt

import org.scalacheck.Gen
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class DecimalToHexadecimalGenSpec extends UnitSpec with GeneratorDrivenPropertyChecks {
  it should "convert decimal to hexadecimal and back to decimal" in {
    val decimals = (for {
      c1 <- Gen.chooseNum(2,100000)
    } yield c1.toString).suchThat(_ != "")

    forAll(decimals){ (decimalStr:String) =>
      var hex = BaseConversion.decimalToHexadecimal(Decimal(decimalStr))
      var decimal = BaseConversion.hexadecimalToDecimal(hex)
      decimal.number shouldBe decimalStr
    }
  }
}
package com.packt

import org.scalatest.prop.TableDrivenPropertyChecks

class DecimalHexadecimalSpec extends UnitSpec with TableDrivenPropertyChecks {


  it should "convert decimal to hex" in {
    val validCombos =
      Table(
        ("1243", "4DB"),
        ("11111122", "A98AD2"),
        ("2435255412343", "2370088A677"),
        ("8765432", "85BFF8")
      )
    forAll(validCombos) { (decStr: String, hexStr: String) =>
      var hex = BaseConversion.decimalToHexadecimal(Decimal(decStr))
      hex.number shouldBe hexStr
    }
  }
}

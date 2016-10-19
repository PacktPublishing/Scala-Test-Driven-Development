  package com.packt

  import org.scalatest.prop.TableDrivenPropertyChecks

  class HexadecimalToDecimalSpec extends UnitSpec with TableDrivenPropertyChecks {

    it should "convert hex to decimal" in {
      val validCombos =
        Table(
          ("171", "AB"),
          ("74667", "123AB"),
          ("11259375", "ABCDEF")
        )
      forAll(validCombos) { (decString: String, hexString: String) =>
        var decimal = BaseConversion.hexadecimalToDecimal(Hexadecimal(hexString))
        decimal.number shouldBe decString
      }
    }
  }

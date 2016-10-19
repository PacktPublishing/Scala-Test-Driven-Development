package com.packt

import org.scalatest.prop.{GeneratorDrivenPropertyChecks}
import org.scalacheck.Gen
import scala.collection.JavaConversions._

class DecimalToBinaryGenSpec extends UnitSpec with GeneratorDrivenPropertyChecks {
  it should "convert decimal to binary and back to decimal" in {
    val decimals = (for {
      c1 <- Gen.chooseNum(2,100000)
    } yield c1.toString).suchThat(_ != "")

    forAll(decimals){ (decimalStr:String) =>
      var binary = BaseConversion.decimalToBinary(Decimal(decimalStr))
      var decimal = BaseConversion.binaryToDecimal(binary)
      decimal.number shouldBe decimalStr
    }
  }
}
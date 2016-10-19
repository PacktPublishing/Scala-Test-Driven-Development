package support.steps

import com.packt.{BaseConversion, Binary, Decimal, Number}

class BaseConversionSteps extends BaseSteps {
  var baseFrom:Number = null
  var baseTo:Number = null

  Given("""^I have a (binary|decimal) number (\d+)$"""){ (x:String, baseFromNumber:String) =>
    baseFrom = if (x=="binary") Binary(baseFromNumber) else Decimal(baseFromNumber)
  }

  When("""^I convert it to (binary|decimal) using the BaseConversion utility$"""){ (x:String) =>
    baseTo = if(x=="binary") BaseConversion.decimalToBinary(baseFrom) else BaseConversion.binaryToDecimal(baseFrom)
  }

  Then("""^I get back a (binary|decimal) number (\d+)$"""){ (x:String, expected: String) =>
    baseTo.number shouldBe expected
  }
}

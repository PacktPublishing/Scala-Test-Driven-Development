Feature: Binary conversions

  Scenario Outline: Binary to decimal conversion
    Given I have a binary number <bin>
    When I convert it to decimal using the BaseConversion utility
    Then I get back a decimal number <dec>
  Examples:
    | bin                      | dec     |
    | 100100111101             | 2365    |
    | 11110001111110111        | 123895  |
    | 100000000000001110000001 | 8389505 |

  Scenario Outline: Decimal to binary conversion
    Given I have a decimal number <dec>
    When I convert it to binary using the BaseConversion utility
    Then I get back a binary number <bin>
    Examples:
      | dec     | bin                      |
      | 2365    | 100100111101             |
      | 123895  | 11110001111110111        |
      | 8389505 | 100000000000001110000001 |


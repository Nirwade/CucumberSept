Feature: This feature would be creating a calculator for Add and Subtract

  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result 9

  Scenario: To Sub
    Given I have a calculator
    When I sub 6 and 3
    Then I should get the result 3

  Scenario Outline: To add multiple numbers addition
    Given I have a calculator
    When I add <num1> and <num2>
    Then I should get the result <result>

    Examples: 
      | num1 |  | num2 |  | result |
      |    8 |  |    3 |  |     11 |
      |    6 |  |    7 |  |     13 |
      |    2 |  |    1 |  |      3 |
@sanity
  Scenario Outline: To add multiple numbers subtraction
    Given I have a calculator
    When I add <num3> and <num4>
    Then I should get the result <result1>

    Examples: 
      | num3 |  | num4 |  | result1 |
      |    8 |  |    3 |  |      11 |
      |    6 |  |    7 |  |      13 |
      |    2 |  |    1 |  |       3 |

  Scenario Outline: To add multiple numbers multiplication
    Given I have a calculator
    When I add <num5> and <num6>
    Then I should get the result <result2>

    Examples: 
      | num5 |  | num6 |  | result2 |
      |    8 |  |    3 |  |      11 |
      |    6 |  |    7 |  |      13 |
      |    2 |  |    1 |  |       3 |

  Scenario Outline: To add multiple numbers using cucumber datatable
    Given I have a calculator
    When I add below numbers using datatable
      | 5 |
      | 7 |
      | 8 |
      | 9 |
    Then I should get the result 29

  Scenario: To add multiple numbers using cucumber datatable
    Given I have a calculator
    When I add below numbers using list
      | 5 |
      | 7 |
      | 8 |
      | 9 |
      | 5 |
    Then I should get the result 34

  Scenario: To calculate the total bill of the order
    Given I have a calculator
    When I order below items using map
      | coffee | 25 |
      | tea    | 25 |
      | Biscut | 20 |
    Then I should get the result 70

  Scenario: To calculate the total bill of the order using quantity
    Given I have a calculator
    When I order below items using quantity and price
     
      | coffee   |        1 |    20 |        
      | tea      |        2 |    30 |      
      | Biscut   |        6 |    30 |      
    Then I should get the result 260

Feature: This feature would be creating a calculator for Add and Subtract

@Unit
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9
    
@Ignore
  Scenario: To Sub
    Given I have a calculator
    When I sub 6 and 3
    Then I should get the result 3

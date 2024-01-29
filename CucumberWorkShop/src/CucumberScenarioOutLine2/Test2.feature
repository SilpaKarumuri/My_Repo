Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the "<password>" in step
    Then I verify the "<status>" in step

    Examples: 
      | name         | password | status |
      | RBG          | java     |     Success |
      | technologies | selenium |     fail |
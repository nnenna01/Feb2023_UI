Feature: "https://demo.guru99.com/selenium/newtours/"

  @NT
 Scenario Outline:  Demonstrate use of Selenium Keys.ENTER

    Given I am on the Newtours website
    When I click on the registration link
    And I enter "<Username>", "<pWord>" and "<confPword>"
    And I enter random email into the email address field
    And I press enter on the submit button
    Then account is created
    Examples:
      | Username | pWord | confPword |
      | Lateef| pppWord | pppWord|
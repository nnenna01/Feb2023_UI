Feature:
  Scenario:Flight Finder page
    Given I am on the Newtours Home page
    When I click on the Flights link on the left side menu
    Then The Flight Finder Page should be displayed
    And “One Way” Flight details type is selected by default
    And “January 1” should be displayed by default for On and returning
    And “Economy Class” should be selected as default for the Service class

#This is Clevers' work and I am trying to rework certain things


  @Newt
  Scenario Outline: Register by entering only User Information
    Given I am on the Newtours Home page
    When I click on the Register link
    And I enter "<Username>", password and confirm as "<Password>"
    And enter "<CountryName>"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"

    Examples:
      | Username | Password    | CountryName |
      | Jose | password120 | ANGOLA      |


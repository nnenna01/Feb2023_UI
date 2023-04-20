
Feature: NopCommerce Page
  @nop
  Scenario: Demonstrate use of mouse hoover
    Given I am on  the nopcommerce website "https://demo.nopcommerce.com/"
    When I navigate to the Desktop page via mouse hoover
    Then Desktop page is displayed

  Scenario: Demonstrate use of mouse hoover
    Given I am on  the nopcommerce website "https://demo.nopcommerce.com/"
    When I navigate to the Desktop page
    Then Desktop page is displayed
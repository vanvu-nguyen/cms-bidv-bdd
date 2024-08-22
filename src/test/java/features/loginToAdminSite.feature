
@login
Feature: Login to admin site
  Background: I open the admin login site
  Scenario: Login by provided credentials
    Given I select English language
    And I input the username
    And I input the password
    When I press login button
    Then I am redirected to admin dashboard page
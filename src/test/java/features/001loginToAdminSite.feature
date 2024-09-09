@adminLogin
  Feature: Admin login to admin site
    Scenario: Admin login successfully to admin site
      Given I have accessed to admin login site
      When I select the English language option
      And I input to username textbox
      And I input to password textbox
      And I click to login button
      Then I will be redirected to dashboard page
@addPosId
Feature: Add pos id to customer
  Scenario Outline: Successfully add pos id to customer
    Given I have accessed to pos management page
    When I click to add button
    And I click to select service id button
    Then The select customer modal displayed
    When I input to service id searchbox on modal with value "<ServiceId>"
    And I click to search customer button on modal
    And I click to expected service id record with value
    And I click to confirm the selected service id
    And I select the beneficiary account with value <BenAcc>
    And I click to select provider id button
    Then The select provider displayed
    When I input to provider id searchbox on modal with value "<ProviderId>"
    And I click to search provider button on modal
    And I click to the expected provider id record with value "<ProviderId>"
    And I click to confirm the selected provider id
    And I input to pos id with value <PosId>
    And I click to save pos id button
    And I input to service id searchbox with value "<ServiceId>"
    And I click to search pos id button
    Then The <PosId> will be listed with the corresponding service id
    Examples:
      | PosId   | BenAcc        | ServiceId | ProviderId  |
      | 150434  | 1000887771123 | huych     | PV00000001  |
      | 150435  | 43543543543   | huych     | PV00000002  |
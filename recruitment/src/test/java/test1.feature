Feature: Place a bet for any football event
  Navigate to the chosen event
  Place a bet
  Check the odds and returns offered

  Scenario: Navigate to football page
    Given I am on the main page
    When I am navigating to football page
    Then I am taken to football page

  Scenario: Choose a match
    Given I am on the football page
    When I choose a <match>
    Then I am taken to the page with odds for the <match>

  Scenario: Place a bet
    Given I am on odds page for the <match>
    When I put <bet_value> Pounds for the <team>
    Then The odds is <odds_value> and the return is <bet_value>(1 + <odds_value>)
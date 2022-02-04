Feature:
  Scenario: Validate the Login functionality of Hrm Applications
    Given I open the chrome browser
    When  User opens the url "https://opensource-demo.orangehrmlive.com"
    Then user enter the as "Admin" and  as "password"
    And close the browser
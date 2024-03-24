@login @android
Feature: login

  @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on home page
    When user click login button
    When user input mail "ugurhanuslu1@gmail.com"
    When user input password "Wwwugurhan57"
    When user click button login
    When wait for captcha solve
    And user close ad popup
    And user click profile button
    When check user credentials "ugurhanuslu1@gmail.com" , "Uğurhan Uslu"
    When user go to settings page
    When user click logout
    Then user confirm logout
    Then check is logout successfully

  @negative
  Scenario: Verify user failed to login when input invalid email and password
    Given user is on home page
    When user click login button
    When user input mail "ugurhanuslu1@gmail.com"
    When user input password "Wwwugurhan"
    When user click button login
    When wait for captcha solve
    Then user check failed login


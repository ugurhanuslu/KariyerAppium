@forgotPassword @android

Feature: Forgot Password

  @positive
  Scenario: Verify user successfully reset password with valid email
    Given user is on home page
    When user click login button
    When user click forgot pass link
    When user input mail "ugurhanuslu@gmail.com"
    When user click button renew pass
    Then user successfully renew

  @negative
  Scenario: Verify user failed reset password with invalid email
    Given user is on home page
    When user click login button
    When user click forgot pass link
    When user input mail "ugurhanuslu666@gmail.com"
    When user click button renew pass
    Then user failed renew

  @negative
  Scenario: Verify user failed reset password with non-email format
    Given user is on home page
    When user click login button
    When user click forgot pass link
    When user input mail "ugurhanusl"
    When user try with unregular mail format

  @negative
  Scenario: Verify user failed to login when input empty email
    Given user is on home page
    When user click login button
    When user click forgot pass link
    When user try with unregular mail format
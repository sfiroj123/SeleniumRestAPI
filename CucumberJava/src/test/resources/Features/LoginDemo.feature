Feature: Test login functionality

  Scenario Outline: Check login is sucessful with valid credential
    Given Browser is open for Login
    And User is on login page
    When user enter <username> and <password>for Demo
    Then user is navigated to the home page
    Examples:
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |

      
      
      

  #Scenario: Check login is sucessful with valid credential
  #Given Browser is open for Login
  #And User is on login page
  #When user enter username and passwordfor Demo
  #Then user is navigated to the home page
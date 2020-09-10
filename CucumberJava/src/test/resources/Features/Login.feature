
#@SmokeScenario
Feature: feature to test login functionaltiy
@SomeTest
  Scenario: Check locin is sucessfully whith valid credentilal
   Given User is on line page
    When user enter username and password
    And Click on login button
    Then use is navigated to the home page

  #Scenario: Chekc login is sucessfull with valid credential
   #Given User is on line page
    #When user enter <username> and <password>
    #And Click on login button
    #Then use is navigated to the home page
    #Examples:
    #|username|password|
    #|aaaa|aaaa| 
    #|bbbbbb|bbbbb|
   

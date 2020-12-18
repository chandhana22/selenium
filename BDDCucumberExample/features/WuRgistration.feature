Feature: WU Registration

  Scenario Outline: Verify WU Registration for India Application
    Given open chrome browser
    When user enter the WU registration url
    Then verify that user lands on WU registration page successfully
    And verify WU logo at the top left
    And Enter user first name as <firstName>, middle name as <middelName> and last name as <lastName>
    And Enter user enters email as <emailID> and password as <password>
    And Enter user address information
    And Enter user addl information
    And Enter user security details
    And Verify the terms and conditions check boxes with text
    And Click the finish button on the bottom of the form
    And user click on WU logo on the top left in registration page
    Then verify that user is landed on WU home page
    And user click on login button in WU home page
    Then verify that user landed on WU login page
    And user enters login details as  <loginUuserName> and <loginPassword> in the login form
    And user close the browser

    Examples: 
      | firstName | middelName | lastName   | emailID                  | password     | loginUuserName           | loginPassword |
      | Anil      | Gowda      | Valligatla | automation@gmail.com     | MyPass123!   | myemail@gmail.com        | MyPass1234!   |
      | Subbu     | Gowda      | Marani     | automationHive@gmail.com | MyPass12345! | automationHive@gmail.com | MyPass123456! |

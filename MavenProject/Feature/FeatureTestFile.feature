
Feature: Login Intel
  I want to login the application this template for my feature file

   Scenario: User is able to login
    Given User Launch Crome Browser
    When User open the given URL "https://admin-demo.nopcommerce.com/login"
  	And User enter the username as "admin@yourstore.com" and password as "admin"
    And Click on Log In button
    Then User moves to the home page and page title should be "Dashboard / nopCommerce administration"
    When user click on Logout button
    Then Page Title should be "Your store. Login"
    #And Close the browser
    
        


 

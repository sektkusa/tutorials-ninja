Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: register store
    Given navigate to ninja tutorials page
    When I click myaccount and click register
    And I enter First name as ""
    And I enter last name as ""
    And I enter Email as ""
    And I enter telephone as ""
    And I enter password as ""
    And I enter password confirm as ""
    And aggre the privacy policy
    And click on continue button
    Then i click login

  Scenario: continue ordering phone
    Given navigate to tutorialsninja login page
    When i login by entering "email" and "pwd"
    And select your type of currency
    And click on search box and add your search text as ""
    And add your fliter criteria as ""
    And click add to cart and check out
    And enter your billing details like f_name, l_name, Address, City, Postcode, country, region/state as "", "", "", "", "", "", ""
    And enter your delivery details and click continue
    And enter your delivery method and click continue
    And enter your payment method and click continue
    Then confirm your order

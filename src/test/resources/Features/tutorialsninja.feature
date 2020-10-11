
Feature: 

  Scenario: register store for valid input
    Given navigate to ninja tutorials page
    When I click myaccount and click register
    And I enter all required input and click continue
      | firstname     | lastname    | email            | telephone  | password  | confirmpassword | logout |
      | amudharanjani | palaniappan | amudha@gmail.com | 1234567890 | pass12345 | pass12345       | false  |
    Then get the response
      | Your Account Has Been Created! |

  Scenario: register store for duplicate email id
    Given navigate to ninja tutorials page
    When I click myaccount and click register
    And I enter all required input and click continue
      | firstname     | lastname    | email            | telephone  | password  | confirmpassword | logout |
      | amudharanjani | palaniappan | amudha@gmail.com | 1234567890 | pass12345 | pass12345       | true   |
      | amudharanjani | palaniappan | amudha@gmail.com | 1234567890 | pass12345 | pass12345       | false  |
    Then get the response
      | E-Mail Address is already registered! |

  Scenario: register store for empty firstname
    Given navigate to ninja tutorials page
    When I click myaccount and click register
    And I enter all required input and click continue
      | firstname | lastname    | email            | telephone  | password  | confirmpassword | logout |
      |           | palaniappan | amudha@gmail.com | 1234567890 | pass12345 | pass12345       | false  |
    Then get the response
      | First Name must be between 1 and 32 characters! |

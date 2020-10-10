# tutorials-ninja
http://tutorialsninja.com/demo/

Please use the above application under test and create new maven project and develop a clean and neat cucumber test automation framework with selenium, testng integration. 

Prerequisites:
1.	Capture all required page objects for performing one full workflow. 
2.	Define scenarios in cucumber feature and associated step definitions that has the automation logic
3.	Create testng test runner file that will help mapping scenarios with the step definition while the test is executed (no junit)
4.	Create testng.xml that will execute the testng test runner class 
5.	Configure the pom.xml with surefire plugin to invoke the testng xml

Acceptance Criteria (aka) Business Requirement : 

1.	As a user of this application I want to Register using Registration page and Sign into my account on home page to place my order
2.	I can set my Currency to "$ US Dollar" on home page
3.	I can click on Search Magnifier glass on the home page, add filter criteria as "iPhone" under "Phones & PDAs" category and perform a search to validate the search results
4.	I can validate the price of the "iPhone" listed in search results grid that I searched for
5.	I should be able to add "iPhone" from search results to the Cart and view the items and details in the cart by clicking on   and validate the data
6.	I should be able to checkout and fill all required information to proceed with the order confirmation
7.	When I confirm the order, I also need to validate the transaction was successful or not 
8.	Then I should be able to logout of the application



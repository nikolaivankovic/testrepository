This is a simple suite for testing some shiftplanning.com functionalities.

Following test cases are covered: 
  Log In - Two negative and one positive test case (login with wrong email/password, successfull login)
  Adding new employee,
  Clock In / Clock Out functionality
  
  There are separate classes for pages (LogIn page, Dashboard page, Schedule page) and separate test classes for all these pages.
  BrowserFactory class is generating webdriver for selected browser. Drivers are included (resources/Drivers folder).
  In test clases we specify which page and page URL we want to use. testng.xml file is giving ability for parallel test execution. 
  
  Tests are written in Intellij IDEA using Java, Selenium and Page object pattern. 
  

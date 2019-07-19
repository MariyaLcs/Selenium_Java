# Selenium_Java
Automation Test with Selenium WebDriver and Java

This project was based on material from the Udemy course - Selenium WebDriver with Java-Basics to Advanced+Frameworks, and completed in July, 2019.

I started with the creation of the Maven Project, as a tool to build and manage a Java-based project. I configured the framework dependencies in POM.xml.

Then I implemented a page object mechanism to drive tests and utilised reusable utilities and variables. For example, I tested the HomePage with reusable data about the browser and URL.

I then created multiple tests with centralised data - for example the LoginPage file - and used TestNG to parameterize the test with multiple data. I used testcases with data validation – for example, I validated the title of the landing page.

Following this, I added tests to the suite, and converted the framework into a Testng.xml file. TestNG could then generate a proper report with passed and failed tests.

I then used Log4j for logging inside the framework. For this purpose I created a log4j2.xml file – it was used to create logs with validation of the titles.  

Then I added TestNG Listeners to make a screenshot of the test failures and used try/catch blocks to handle them. In the project it is the listeners.java file. The screenshot was captured and held in the main folder with unique filenames.

At the end I used Jenkins for Continuous Integration. It was utilised to set up scheduling for testing and creating reports.


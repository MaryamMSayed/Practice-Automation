# Practice-Automation  :rocket:
  ## Tech Stack :oil_drum:
* Language: Java
* Test Framework: TestNG
* Build Tool: Maven
* Design Pattern: Page Object Model (POM)
* Browser Management: WebDriverManager
* Reports: ExtentReports and Allure 
* Logging: Log4j or SLF4J 
* Data Handling: Excel, JSON, and CSV
* CI: GitHub Actions
________________________________________________________________________________________________________________________
## Project Structure :page_with_curl:
practice-Automation/<br/>
│<br/>
├── src/<br/>
│    ├── main/<br/>
│    │   └── java/<br/>
│    │       ├── base/                 # BasePage<br/>
│    │       ├── drivers/                # DriverFactory, ConfigReader, WaitUtils<br/>
│    │       ├── elementactions/                # ElementActions, <br/>
│    │
│    └── test/<br/>
│       └── java/<br/>
│           ├── pages/               # Page classes (LoginPage, HomePage)<br/>
│           ├── tests/               # Test classes<br/>
│           ├── data/                # Test data or DataProviders<br/>
│           └── runners/             # TestNG suite runners<br/>
│
├── resources/<br/>
│   ├── config.properties<br/>
│   └── testdata/<br/>
│
├── testng.xml<br/>
├── pom.xml<br/>
└── README.md<br/>

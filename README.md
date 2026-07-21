# JanbaskDemoAutomation

Automation framework for the e-commerce demo site (janbaskdemo.com) using Selenium WebDriver with Java. This project follows the Page Object Model (POM) design pattern and uses Cucumber (Gherkin) for BDD, TestNG for test execution, and the inbuilt Cucumber plugin for reporting.

## Table of Contents
- [Project Overview](#project-overview)
- [Key Features](#key-features)
- [Tech Stack](#tech-stack)
- [Repository Structure](#repository-structure)
- [Prerequisites](#prerequisites)
- [Setup & Installation](#setup--installation)
- [Running Tests](#running-tests)
- [Reports](#reports)
- [Best Practices](#best-practices)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Project Overview
This framework automates functional flows of the Janbask demo e-commerce site using a maintainable and extendable test automation architecture:
- BDD with Cucumber for readable feature definitions.
- Page Object Model for page abstractions and reusability.
- TestNG as the test runner and orchestration layer.
- Built-in Cucumber reporting for feature-level results.

## Key Features
- Readable BDD-style feature files (Gherkin).
- Clear separation of concerns: page objects, step definitions, test runners.
- Configurable browser and environment settings.
- Parallel execution support via TestNG (optional).
- Reusable utilities for waits, logging, and test data handling.
- Report generation via Cucumber plugin (JSON/HTML) and optional integration with reporting tools (Allure, Extent).

## Tech Stack
- Java (JDK 11+ recommended)
- Selenium WebDriver
- Cucumber (Gherkin)
- TestNG
- Maven (build & dependency management)
- WebDriverManager (recommended for driver management)
- Optional: Allure or ExtentReports for advanced reporting

## Repository Structure
A suggested/typical layout used in this project:

- src
  - main
    - java
      - com.janbask.framework
        - pages/           # Page Object classes
        - utils/           # Helper utilities (Driver, Waits, Config)
        - listeners/       # TestNG/Cucumber listeners (optional)
  - test
    - java
      - com.janbask.tests
        - runners/         # TestNG / Cucumber runners
        - stepdefinitions/ # Step definition classes
    - resources
      - features/          # .feature files (Gherkin)
      - testdata/          # Test data files (JSON/CSV)
      - configs/           # config.properties or environment files
- pom.xml                  # Maven configuration
- README.md

Adjust paths above to match actual repo layout if it differs.

## Prerequisites
- Java JDK 11 or newer
- Maven 3.6+
- Chrome / Firefox browser (matching driver versions)
- (Recommended) Use WebDriverManager to avoid manual driver binaries

## Setup & Installation

1. Clone the repository
   git clone https://github.com/TestingTequila/JanbaskDemoAutomation.git
   cd JanbaskDemoAutomation

2. Configure environment
   - Edit configuration files (e.g., src/test/resources/configs/config.properties) to set:
     - base.url
     - browser (chrome/firefox)
     - implicit/explicit wait timeouts
     - environment-specific values (if any)

3. Install dependencies and build
   mvn clean install -DskipTests

Notes:
- If the project uses WebDriverManager, no manual driver installation is needed.
- If not, download the appropriate driver (chromedriver/geckodriver) and add it to PATH or configure the driver path in your config.

## Running Tests

Run the full test suite:
- mvn clean test

Run a specific TestNG suite or runner:
- mvn -Dtest=TestRunnerClassName test

Run Cucumber features by tag:
- mvn test -Dcucumber.options="--tags @smoke"

Parallel execution (if configured via TestNG XML):
- mvn clean test -Dsurefire.suiteXmlFiles=testng.xml

Tips:
- Use tags in feature files to group tests (e.g., @smoke, @regression, @wip).
- Adjust logging level or TestNG parallel settings in pom.xml / testng.xml.

## Reports
- The project uses the Cucumber plugin to produce feature-level HTML/JSON reports (check target/cucumber-reports or target/site).
- To enable more advanced reporting (Allure/Extent), add the corresponding dependency and configure result generation in the test runner/listener.

## Best Practices
- Keep page objects focused: one class per page, only expose high-level actions.
- Keep step definitions thin: delegate to page objects and service layers.
- Centralize configuration and environment-specific data.
- Avoid sleeps; use explicit waits or utility wait methods.
- Use descriptive scenario names and tags in Gherkin feature files.

## Troubleshooting
- Browser/driver mismatches: confirm browser version and driver version compatibility.
- Tests fail on CI but pass locally: check headless mode, environment variables, and resource availability.
- Flaky tests: add stable locators, explicit waits, and avoid heavy UI timing assumptions.
- If tests can't find features or step definitions, confirm the glue/feature paths in the runner.

## Contributing
- Fork the repository and create a feature branch.
- Follow existing code style and naming conventions.
- Add/modify feature files with clear Gherkin scenarios.
- Update or add page objects and step definitions as needed.
- Run tests locally and ensure they pass before creating a pull request.
- Include descriptive PR title and explanation of changes.

## License
This repository does not include a license file by default. Add a LICENSE (for example MIT) if you want to make the project open source.

## Contact
Project maintained by the Janbask automation team.

If you want, I can:
- Commit this README.md to the repository,
- Update it to match the exact file/folder structure of the repo (I can inspect the repo and adapt the paths),
- Add CI examples (GitHub Actions) to run the tests automatically.

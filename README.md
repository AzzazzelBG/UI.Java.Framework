# Selenium Java Testing Framework
## Description:

This repository provides a robust and well-structured Selenium Java testing framework designed to simplify and enhance your web application automation efforts. It promotes maintainability, scalability, and reusability of your test scripts.

## Features:

- **Page Object Model (POM)**: Encapsulates UI elements and interactions for clean test logic.
- **TestNG Integration**: Leverages TestNG's powerful features for test execution, reporting, and assertions.
- **Driver Management**: Simplifies browser driver setup using WebDriverManager (or your preferred approach).
- **Configuration Management**: Easily manage test environment configurations (e.g., URLs, credentials) using properties files or environment variables.
- **Test Data Management**: Separates test data from test scripts for better organization and maintainability (e.g., CSV, JSON, or database).
- **Logging**: Integrates with a logging library (e.g., Log4j, SLF4J) for detailed test execution logs.
- **Reporting**: Offers clean and informative test reports (e.g., TestNG reports, Allure reports).
- **Modular Design**: Promotes code reusability through well-defined classes and packages.
## Getting Started:

1. Prerequisites:
    - Java Development Kit (JDK) 1.8 or later
    - Maven dependency management tool (https://maven.apache.org/)
2. Clone the repository:

**Bash**
```
 git clone https://github.com/<your-username>/<your-repo-name>.git 
 ```

3. Set up environment:
    - Configure the appropriate environment variables or properties files for your test setup (e.g., base URL, credentials).
4. Run tests:
    - Navigate to the project directory.
    - Execute the following command using Maven:

**Bash**
```
mvn clean test
```

## Project Structure:

(Provide a high-level overview of your project's directory structure, highlighting key folders like src/main/java, src/test/java, resources, etc.)

### Example Usage:

(Include a basic example of how to create a test class using the framework, demonstrating interactions with page objects and assertions.)

## Contributing:

We welcome contributions to improve this framework! Please refer to the CONTRIBUTING.md file for guidelines on submitting pull requests and style guide recommendations.

## License:

[MIT License](https://github.com/AzzazzelBG/UI.Java.Framework/tree/main?tab=MIT-1-ov-file#)

## Additional Notes:

The framework and all its content is still under development which could lead to some inconveniences if you don't use the latest version from this repository.

## Next steps and ideas

- Create several tests for the BookStore app in DemoQA website
- ~~Improve the Navigation Panel page object by adding enums for all possible pages in the BookStore~~
- Use the @before @beforeAll @after and @afterAll TestNG attributes in tests
- Implement Retry functionality to use it as attribute for flaky tests
- Include tests with various test data combinations
- Add support for database data insertion
- Prepare the framework for integration with CI/CD
- Add Cucumber functionalities and tests

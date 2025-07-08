
# QE Technical Assessment – Automation Project

This repository contains an automated test suite designed for validating the **Sentiments Feedback Widget**. It is built using **Java**,**Selenium**, **Cucumber (BDD)**, **TestNG**, and **Maven**, and follows the **Page Object Model (POM)** design pattern.

---

## 🧪 Test Objectives

- Verify widget visibility
- Test rating, topic selection, and comment functionality
- Validate feedback submission and confirmation
- Cover edge cases and negative scenarios
- Maintain all test cases in `.feature` files

---

## ✅ Prerequisites

- Java 20+
- Maven 3.8+
- Chrome or Firefox browser
- Optional: IntelliJ IDEA / VS Code

---

## 🚀 How to Run the Tests

1. **Clone the Repository**

```bash
git clone https://github.com/lokeshsamant/GDSQE.git
cd GDSQE
```

2. **Set the Desired Browser**

Edit in:  
`src/test/resources/com/db/config/environments/config.properties`

```properties
browser=chrome  # firefox | chrome 
```

3. **Run Tests via Maven**

```bash
mvn clean test
```

4. **Run with Specific Environment**

Set the desired environment in `config.properties`:

```properties
env=test  # dev | test | prod
```
Or specify the environment at runtime by setting the APP_ENV variable:
```properties
mvn clean install -Denv=test     # dev | test | prod
```
---

## 📄 Reports

After execution, open the following file in a browser:

```
/target/cucumber-html-reports/feature-overview.html
```

Includes:
- Feature and scenario overview
- Pass/fail status
- Step execution time
- Embedded failure screenshots

---

## 🛡️ License

This project is proprietary and used solely for assessment purposes.

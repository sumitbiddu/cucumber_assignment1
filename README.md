# BDD Cucumber Automation Framework – PHPTRAVELS

## Overview

This project is a Selenium-based UI automation framework built using Behavior Driven Development (BDD) with Cucumber for the PHPTRAVELS application.

It automates real-world user workflows such as login, service selection, cart management, checkout, and invoice generation.

The framework is designed to improve test readability, maintainability, and collaboration by using business-readable test scenarios.

---

## Application Under Test

PHPTRAVELS – Client Area & Services Module

---

## Tech Stack

- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Page Object Model (POM)
- ExtentReports
- Maven

---

## Framework Structure

- **features/** → Cucumber feature files written in Gherkin syntax
- **stepdefinitions/** → Java step definition classes mapping feature steps
- **pages/** → Page Object Model classes handling UI interactions
- **runners/** → TestNG/Cucumber runner class
- **wrappers/** → Reusable Selenium wrapper methods

---

## End-to-End Flow Covered

The framework automates the complete user journey:

Login → Navigate to Services → Select Mobile Service → Add to Cart → Checkout → Validate Product → Complete Order → Generate Invoice

---

## Sample Feature Scenario

```gherkin
Feature: Service Purchase Flow

Scenario: User completes mobile service order
  Given user is logged into PHPTRAVELS application
  When user navigates to services section
  And user selects mobile service
  And user adds service to cart
  And user completes checkout process
  Then invoice should be generated successfully

# Kariyer.net Mobile App Testing with Appium, Java, Cucumber and Serenity

# Description

This project serves as an example test scenarios for testing Kariyer.net mobile applications using Appium, Java, Cucumber and Serenity with a BDD (Behavior-Driven Development) approach. Testing is conducted using a BDD testing framework, such as Cucumber.

# Requirements

Before getting started, make sure you have the following requirements fulfilled:

1. JDK (Java Development Kit) installed on your machine.
2. Maven installed on your machine.
3. Appium installed on your machine.
4. The application to be tested installed on an emulator or physical device.

# Installation

1. Clone this repository to your machine:

```
git clone https://github.com/username/repo.git
```

2. Navigate to the project directory:

```
cd project-directory
```

3. mvn clean install

```
mvn clean install
```

# Configuration

1. Ensure that the Appium configuration is set up according to the emulator or device you will be testing against. Edit the `src/main/java/drivers/AndroidDriverInit.java` file and adjust it to your configuration.
2. Ensure that the path to the application file (APK) to be tested is correct. Edit the `src/main/java/drivers/AndroidDriverInit.java` file and set it to the correct path to your APK.

# Running Tests

To run the tests, you can use the following Maven command:

```
mvn clean verify -Dtags="@android"
```

# License

Created with ❤️ by Ugurhan Uslu.

---


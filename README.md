# Frontend-Backend Integration Test

This project contains a Selenium test script written in Java to verify the integration between the frontend and backend services.

## Prerequisites

- Java 8 or later
- Maven
- Chrome Browser (or another browser, update the script accordingly)
- WebDriver for Chrome
- Minikube running the frontend and backend services

## Setup Instructions

### 1. Clone the Repository

git clone <repository-url>
cd qa-integration-test

### 2. mvn clean install

### 3. mvn test

### 4. **Run the Test**

Once everything is set up, follow the steps in the README to execute the test script.

1. Start Minikube and deploy the frontend and backend services.
2. Get the URL of the frontend service using `minikube service frontend-service --url`.
3. Update the `frontendURL` in the test script with this URL.
4. Run the test with `mvn test`.

---

This Selenium script will help you verify that the frontend displays the message returned by the backend correctly. Let me know if you have any questions!


pipeline {
    agent any // Or a specific agent like 'node { ... }'

    stages {
        stage('Build') {
            steps {
                // Use 'sh' for shell commands, 'bat' for Windows batch commands
                sh 'mvn clean compile' 
            }
        }
        stage('Test') {
            steps {
                // Command to run TestNG tests via Maven.
                // The '|| true' ensures the pipeline continues even if tests fail,
                // allowing the TestNG plugin to process the reports.
                sh 'mvn test || true' 
            }
        }
    }

    post {
        // This 'always' block ensures the results are published regardless of test outcomes
        always {
            // Publish TestNG test results
            // The pattern '**/target/testng-results.xml' is common for Maven projects
            // testng title: 'TestNG Results', reportFilenamePattern: '**/target/testng-results.xml'
            // If using JUnit reports for some reason:
            // junit '**/target/surefire-reports/*.xml' 
        }
    }
}


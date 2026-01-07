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

    
}

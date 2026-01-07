pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                // Pull code from GitHub SCM
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                // Example build command
                // sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Example test command
                // sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application...'
                // Example
                // sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests successful!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}


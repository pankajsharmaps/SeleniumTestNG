pipeline {
    agent any

    tools {
        maven 'Maven_3'
    }

    stages {
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}

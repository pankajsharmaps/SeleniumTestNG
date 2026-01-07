pipeline {
    agent any

    tools {
        maven 'Maven_3'
    }

    stages {
        stage('Test') {
            steps {
				// bat for windows, sh for linux
                bat 'mvn test'
            }
        }
    }
}


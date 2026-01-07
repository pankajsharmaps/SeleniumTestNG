pipeline {
    agent any

    tools {
        maven 'Maven_3'
    }

    stages {
        stage('Test') {
            steps {
				// bat forwindows, sh for linux
                bat 'mvn test'
            }
        }
    }
}

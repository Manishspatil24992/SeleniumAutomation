pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    environment {
        BROWSER = 'chrome'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Manishspatil24992/SeleniumAutomation.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test -Dbrowser=%BROWSER%'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            echo 'Execution Completed'
        }

        success {
            echo 'Build SUCCESS'
        }

        failure {
            echo 'Build FAILED'
        }
    }
}

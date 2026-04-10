pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    environment {
        BROWSER = 'chrome'
    }

    stages {

        stage('Run Tests') {
            steps {
                bat 'cd C:\\Users\\Manish\\eclipse-workspace\\SeleniumAutomation && mvn clean test -Dbrowser=%BROWSER%'
            }
        }
    }

    post {
        always {
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
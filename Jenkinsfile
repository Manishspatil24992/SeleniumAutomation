pipeline {
    agent any

    tools {
        maven 'Maven'      // Must match Jenkins Global Tool Configuration
        jdk 'JDK17'        // Must match Jenkins JDK name
    }

    environment {
        BROWSER = 'chrome'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Manishspatil24992/SeleniumAutomation.git'
            }
        }

        stage('Build & Run Tests') {
            steps {
                bat 'mvn clean test -Dbrowser=%BROWSER%'
            }
        }

        stage('Post Build - Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
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

        failure {
            echo 'Build FAILED'
        }
    }
}

pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/SaiYugandhar22/git-maven-simple.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                script {
                    if (fileExists('target/git-maven-simple-0.0.1-SNAPSHOT.jar')) {
                        bat 'start /b java -jar target/git-maven-simple-0.0.1-SNAPSHOT.jar'
                    } else {
                        error "JAR file not found! Build might have failed."
                    }
                }
            }
        }
    }
}

pipeline {
    agent {
        label 'jenkins-slave4'
    }
    stages {
        stage('Clone repo') {
            steps {
                git branch: 'main', url: 'https://github.com/svgroz/imtiredofit.git'
            }
        }
        stage('Build jar') {
            steps {
                container('java17') {
                    sh './gradlew build'
                }
            }
        }
    }
}

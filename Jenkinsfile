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
        stage('Build image') {
            steps {
                container('kaniko') {
                    sh '''/kaniko/executor \
                            --dockerfile=`pwd`/Dockerfile \
                            --context=`pwd` \
                            --destination=cicd-registry:5000/imtiredofit/server:latest \
                            --insecure \
                            --skip-tls-verify \
                            --verbosity debug
                        '''
                }
            }
        }
    }
}

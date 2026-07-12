pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Parallel Build') {
            parallel {

                stage('Maven Build') {
                    steps {
                        dir('student-grade-manager') {
                            sh 'mvn clean test'
                        }
                    }
                }

                stage('CMake Build') {
                    steps {
                        dir('led-firmware') {
                            sh '''
                            mkdir -p build
                            cd build
                            cmake ..
                            make
                            '''
                        }
                    }
                }
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}

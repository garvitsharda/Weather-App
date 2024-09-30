pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/anushksanghvi/WeatherApp.git']])
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                sh 'docker build -t anushksanghvi/weatherappcicd:v1.0 .'
                }
            }
        }
        stage('Docker Login and Push') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u anushksanghvi -p ${dockerhubpwd}'
                    }
                    
                    sh 'docker push anushksanghvi/weatherappcicd:v1.0'    
                }
            }
        }
        
    }
}

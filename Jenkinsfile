pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git credentialsId: 'Sidddhh', branch: 'main', url: 'https://github.com/Sidddhh/Jenkins_pipeline.git'

            }
        }

        stage('Compile Java Code') {
            steps {
                sh 'javac *.java'
            }
        }

        stage('Run Main Program') {
            steps {
                sh 'java Main'
            }
        }
    }
}

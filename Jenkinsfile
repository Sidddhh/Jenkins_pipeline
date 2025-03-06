pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/your-username/your-repo.git'
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

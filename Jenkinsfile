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
                bat 'javac -d . *.java'  // Compiles all Java files
            }
        }

        stage('Verify Compilation') { // Debugging step
            steps {
                bat 'dir /B *.class'  // Lists compiled Java class files
            }
        }

        stage('Run Main Program') {
            steps {
                bat 'java Program1' // Runs Program1, which triggers Program2
            }
        }
    }
}

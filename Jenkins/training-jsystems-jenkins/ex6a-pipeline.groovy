pipeline {
    agent any
    stages {
        stage('Example stage') {
            steps {
                sh 'echo "This is an example stage."'
                sh 'exit 1'
            }
        }
    }
    post {
        failure {
            echo "Stage failed. Triggering downstream pipeline..."
            build job: 'mikolaj-pipeline-ex6b', parameters: [string(name: 'EXAMPLE_VAR', value: 'example_value')]
        }
    }
}

def call() {
    stage('Checkout') {
        checkout scm
    }

    

    stage('Deploy') {
        echo 'Deploying to environment...'
        sh './deploy.sh'
    }
}

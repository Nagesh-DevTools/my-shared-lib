def call(Map config = [:]) {
    stage('Build') {
        echo "Building application: ${config.appName}"
        sh "mvn clean package"
    }
    stage('Security Scan') {
        if (config.runScan) {
            echo "Running Security Scan..."
            sh "ls -la" // Mock scan command
        }
    }
}

def call(Map config) {
  stage('Build') {
    sh "echo Building ${config.app}"
    sh "echo Build completed"
  }

  stage('Test') {
    sh "echo Testing ${config.app}"
    sh "echo Tests passed"
  }
}

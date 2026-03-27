def call(Map config) {
  stage('Build') {
    sh "echo Building ${config.app}"
    sh "./gradlew build"
  }

  stage('Test') {
    sh "echo Testing ${config.app}"
    sh "./gradlew test"
  }
}

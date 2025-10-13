// vars/buildAndTest.groovy
def call(String appDir = 'demo-java-app') {
  echo "Listing files in workspace..."
  sh 'ls -ltr'

  echo "Building project in ${appDir}..."
  sh "cd ${appDir} && mvn clean package"
}

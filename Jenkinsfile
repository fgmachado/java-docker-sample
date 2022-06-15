node {

  stage('Buid app') {
    git url: 'https://github.com/fgmachado/java-docker-sample'

    withMaven {
      sh "mvn compile com.google.cloud.tools:jib-maven-plugin:3.2.1:dockerBuild"
    }
  }

  stage('Deploy') {

  }

}
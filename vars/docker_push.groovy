def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(
    credentialsId:"dockerHubCred",
    usernameVariable:"dockerHubUser",
    passwordVariable:"dockerHubPass")]){
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}
}
  sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
}

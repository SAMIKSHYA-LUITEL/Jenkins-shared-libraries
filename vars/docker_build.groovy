def call(StringProjectName, StringImageTag, StringDockerHubUser){
  sh "docker build -t ${"dockerhubUser"}/${"ProjectName"}:${"ImageTag"}
}

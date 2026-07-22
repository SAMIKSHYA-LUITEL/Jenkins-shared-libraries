def imageName = "${env.DOCKERHUB_USER}/${params.projectName.toLowerCase()}:${params.imageTag}"
   sh "docker build -t ${imageName} ."

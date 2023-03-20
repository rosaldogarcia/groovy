// def map = [folder_app_1: folder_app_1, 
//             folder_app_2: folder_app_2
//             ]

//         map.findAll { key, value -> 
//           if (value.contains("true")) {
//         // println key.replace("_","-")
//           //  def repoName = key.replace("_","-")
//           def repoName
//            repoName =  key.replace("_","-")
//           } 
//         }

def map = [ folder_app_1: folder_app_1, folder_app_2: folder_app_2 ]

map.findAll { key, value -> 
          if (value.contains("true")) {
        // println key.replace("_","-")
          //  def repoName = key.replace("_","-")
          println key.replace("_","-")
          } 
        }


node {
    stage('Step1') {
        if (env.BRANCH_NAME == 'main') {
            echo 'Hello from main branch'
        } else {
            sh "echo 'Hello from ${env.BRANCH_NAME} branch!'"
        }
    }
}
def map = [folder_app_1: folder_app_1, 
            folder_app_2: folder_app_2
            ]

        map.findAll { key, value -> 
          if (value.contains("true")) {
        // println key.replace("_","-")
          //  def repoName = key.replace("_","-")
          def repoName
           repoName =  key.replace("_","-")
          } 
        }
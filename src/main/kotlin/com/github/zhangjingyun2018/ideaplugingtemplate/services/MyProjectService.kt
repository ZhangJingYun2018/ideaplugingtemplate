package com.github.zhangjingyun2018.ideaplugingtemplate.services

import com.intellij.openapi.project.Project
import com.github.zhangjingyun2018.ideaplugingtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

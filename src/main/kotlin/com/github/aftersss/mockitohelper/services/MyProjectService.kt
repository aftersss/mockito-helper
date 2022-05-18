package com.github.aftersss.mockitohelper.services

import com.intellij.openapi.project.Project
import com.github.aftersss.mockitohelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

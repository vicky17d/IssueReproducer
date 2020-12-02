package com.github.vicky17d.issuereproducer.services

import com.github.vicky17d.issuereproducer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

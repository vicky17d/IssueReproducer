package com.github.vicky17d.issuereproducer.services

import com.intellij.openapi.project.Project
import com.github.vicky17d.issuereproducer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

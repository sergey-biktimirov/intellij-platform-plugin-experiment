package com.github.sergeybiktimirov.intellijplatformpluginexperiment.services

import com.intellij.openapi.project.Project
import com.github.sergeybiktimirov.intellijplatformpluginexperiment.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

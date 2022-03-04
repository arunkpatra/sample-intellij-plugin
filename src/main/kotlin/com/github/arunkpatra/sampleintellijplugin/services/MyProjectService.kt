package com.github.arunkpatra.sampleintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.arunkpatra.sampleintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

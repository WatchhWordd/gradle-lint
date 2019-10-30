package com.gradle.customize.lint

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class LintPlugin implements Plugin<Project> {

    static final String GROUP = 'LintCleaner'
    static final String EXTENSION_NAME = 'lintCleaner'

    @Override
    void apply(Project project) {

        project.extensions.create(EXTENSION_NAME,LintExtend.class,project)

        Task cleanTask = project.tasks.create(CleanTask.NAME, CleanTask)
    }
}

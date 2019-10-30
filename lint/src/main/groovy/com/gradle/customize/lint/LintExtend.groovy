package com.gradle.customize.lint

import org.gradle.api.Project;

class LintExtend {

    String lintXmlPath
    String outputPath

    LintExtend(Project project) {
        // 默认路径
        lintXmlPath = "$project.buildDir/reports/lint-results.xml"
        outputPath = "$project.buildDir/reports/lintCleanerLog.txt"
    }

    @Override
    String toString() {
        return "配置项:\n\tlintXmlPath:" + lintXmlPath + "\n" +
                "outputPath:" + outputPath + "\n"
    }
}
package Tiger0624

import Tiger0624.buildTypes.*
import Tiger0624.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0624")
    name = "Tiger0624"

    vcsRoot(Tiger0624_cVCSroot)

    buildType(Tiger0624_Hi0)
    buildType(Tiger0624_Hi3)
    buildType(Tiger0624_Hi1)
    buildType(Tiger0624_Hi2)
})

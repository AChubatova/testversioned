package Tiger0813

import Tiger0813.buildTypes.*
import Tiger0813.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0813")
    name = "Tiger0813"

    vcsRoot(Tiger0813_cVCSroot)

    buildType(Tiger0813_Hi3)
    buildType(Tiger0813_Hi2)
    buildType(Tiger0813_Hi1)
    buildType(Tiger0813_Hi0)
})

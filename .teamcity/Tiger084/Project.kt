package Tiger084

import Tiger084.buildTypes.*
import Tiger084.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger084")
    name = "Tiger084"

    vcsRoot(Tiger084_cVCSroot)

    buildType(Tiger084_Hi0)
    buildType(Tiger084_Hi2)
    buildType(Tiger084_Hi1)
    buildType(Tiger084_Hi3)
})

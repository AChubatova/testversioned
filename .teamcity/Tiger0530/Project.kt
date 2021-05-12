package Tiger0530

import Tiger0530.buildTypes.*
import Tiger0530.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0530")
    name = "Tiger0530"

    vcsRoot(Tiger0530_cVCSroot)

    buildType(Tiger0530_Hi3)
    buildType(Tiger0530_Hi0)
    buildType(Tiger0530_Hi1)
    buildType(Tiger0530_Hi2)
})

package Tiger0225

import Tiger0225.buildTypes.*
import Tiger0225.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0225")
    name = "Tiger0225"

    vcsRoot(Tiger0225_cVCSroot)

    buildType(Tiger0225_Hi3)
    buildType(Tiger0225_Hi2)
    buildType(Tiger0225_Hi1)
    buildType(Tiger0225_Hi0)
})

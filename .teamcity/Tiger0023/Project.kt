package Tiger0023

import Tiger0023.buildTypes.*
import Tiger0023.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0023")
    name = "Tiger0023"

    vcsRoot(Tiger0023_cVCSroot)

    buildType(Tiger0023_Hi2)
    buildType(Tiger0023_Hi3)
    buildType(Tiger0023_Hi0)
    buildType(Tiger0023_Hi1)
})

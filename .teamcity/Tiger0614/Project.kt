package Tiger0614

import Tiger0614.buildTypes.*
import Tiger0614.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0614")
    name = "Tiger0614"

    vcsRoot(Tiger0614_cVCSroot)

    buildType(Tiger0614_Hi1)
    buildType(Tiger0614_Hi0)
    buildType(Tiger0614_Hi3)
    buildType(Tiger0614_Hi2)
})

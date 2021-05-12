package Tiger0835

import Tiger0835.buildTypes.*
import Tiger0835.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0835")
    name = "Tiger0835"

    vcsRoot(Tiger0835_cVCSroot)

    buildType(Tiger0835_Hi3)
    buildType(Tiger0835_Hi0)
    buildType(Tiger0835_Hi2)
    buildType(Tiger0835_Hi1)
})

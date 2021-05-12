package Tiger0247

import Tiger0247.buildTypes.*
import Tiger0247.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0247")
    name = "Tiger0247"

    vcsRoot(Tiger0247_cVCSroot)

    buildType(Tiger0247_Hi1)
    buildType(Tiger0247_Hi0)
    buildType(Tiger0247_Hi3)
    buildType(Tiger0247_Hi2)
})

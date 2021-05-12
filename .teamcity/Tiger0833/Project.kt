package Tiger0833

import Tiger0833.buildTypes.*
import Tiger0833.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0833")
    name = "Tiger0833"

    vcsRoot(Tiger0833_cVCSroot)

    buildType(Tiger0833_Hi2)
    buildType(Tiger0833_Hi1)
    buildType(Tiger0833_Hi3)
    buildType(Tiger0833_Hi0)
})

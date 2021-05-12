package Tiger0153

import Tiger0153.buildTypes.*
import Tiger0153.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0153")
    name = "Tiger0153"

    vcsRoot(Tiger0153_cVCSroot)

    buildType(Tiger0153_Hi3)
    buildType(Tiger0153_Hi2)
    buildType(Tiger0153_Hi1)
    buildType(Tiger0153_Hi0)
})

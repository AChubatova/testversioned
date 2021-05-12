package Tiger0429

import Tiger0429.buildTypes.*
import Tiger0429.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0429")
    name = "Tiger0429"

    vcsRoot(Tiger0429_cVCSroot)

    buildType(Tiger0429_Hi0)
    buildType(Tiger0429_Hi1)
    buildType(Tiger0429_Hi2)
    buildType(Tiger0429_Hi3)
})

package Tiger0159

import Tiger0159.buildTypes.*
import Tiger0159.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0159")
    name = "Tiger0159"

    vcsRoot(Tiger0159_cVCSroot)

    buildType(Tiger0159_Hi0)
    buildType(Tiger0159_Hi1)
    buildType(Tiger0159_Hi2)
    buildType(Tiger0159_Hi3)
})

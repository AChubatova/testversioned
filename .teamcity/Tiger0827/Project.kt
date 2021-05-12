package Tiger0827

import Tiger0827.buildTypes.*
import Tiger0827.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0827")
    name = "Tiger0827"

    vcsRoot(Tiger0827_cVCSroot)

    buildType(Tiger0827_Hi0)
    buildType(Tiger0827_Hi1)
    buildType(Tiger0827_Hi2)
    buildType(Tiger0827_Hi3)
})

package Tiger0448

import Tiger0448.buildTypes.*
import Tiger0448.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0448")
    name = "Tiger0448"

    vcsRoot(Tiger0448_cVCSroot)

    buildType(Tiger0448_Hi3)
    buildType(Tiger0448_Hi2)
    buildType(Tiger0448_Hi1)
    buildType(Tiger0448_Hi0)
})

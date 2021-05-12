package Tiger0534

import Tiger0534.buildTypes.*
import Tiger0534.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0534")
    name = "Tiger0534"

    vcsRoot(Tiger0534_cVCSroot)

    buildType(Tiger0534_Hi0)
    buildType(Tiger0534_Hi1)
    buildType(Tiger0534_Hi2)
    buildType(Tiger0534_Hi3)
})

package Tiger01534

import Tiger01534.buildTypes.*
import Tiger01534.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01534")
    name = "Tiger01534"

    vcsRoot(Tiger01534_cVCSroot)

    buildType(Tiger01534_Hi1)
    buildType(Tiger01534_Hi0)
    buildType(Tiger01534_Hi3)
    buildType(Tiger01534_Hi2)
})

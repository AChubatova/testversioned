package Tiger01737

import Tiger01737.buildTypes.*
import Tiger01737.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01737")
    name = "Tiger01737"

    vcsRoot(Tiger01737_cVCSroot)

    buildType(Tiger01737_Hi0)
    buildType(Tiger01737_Hi3)
    buildType(Tiger01737_Hi2)
    buildType(Tiger01737_Hi1)
})

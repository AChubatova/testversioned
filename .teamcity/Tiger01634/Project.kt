package Tiger01634

import Tiger01634.buildTypes.*
import Tiger01634.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01634")
    name = "Tiger01634"

    vcsRoot(Tiger01634_cVCSroot)

    buildType(Tiger01634_Hi3)
    buildType(Tiger01634_Hi2)
    buildType(Tiger01634_Hi1)
    buildType(Tiger01634_Hi0)
})

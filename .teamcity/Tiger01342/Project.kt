package Tiger01342

import Tiger01342.buildTypes.*
import Tiger01342.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01342")
    name = "Tiger01342"

    vcsRoot(Tiger01342_cVCSroot)

    buildType(Tiger01342_Hi0)
    buildType(Tiger01342_Hi2)
    buildType(Tiger01342_Hi1)
    buildType(Tiger01342_Hi3)
})

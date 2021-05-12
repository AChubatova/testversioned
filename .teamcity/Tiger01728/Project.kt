package Tiger01728

import Tiger01728.buildTypes.*
import Tiger01728.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01728")
    name = "Tiger01728"

    vcsRoot(Tiger01728_cVCSroot)

    buildType(Tiger01728_Hi3)
    buildType(Tiger01728_Hi0)
    buildType(Tiger01728_Hi2)
    buildType(Tiger01728_Hi1)
})

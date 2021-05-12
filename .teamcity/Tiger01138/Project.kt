package Tiger01138

import Tiger01138.buildTypes.*
import Tiger01138.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01138")
    name = "Tiger01138"

    vcsRoot(Tiger01138_cVCSroot)

    buildType(Tiger01138_Hi0)
    buildType(Tiger01138_Hi1)
    buildType(Tiger01138_Hi2)
    buildType(Tiger01138_Hi3)
})

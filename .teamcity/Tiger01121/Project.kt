package Tiger01121

import Tiger01121.buildTypes.*
import Tiger01121.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01121")
    name = "Tiger01121"

    vcsRoot(Tiger01121_cVCSroot)

    buildType(Tiger01121_Hi1)
    buildType(Tiger01121_Hi0)
    buildType(Tiger01121_Hi3)
    buildType(Tiger01121_Hi2)
})

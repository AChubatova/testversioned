package Tiger01118

import Tiger01118.buildTypes.*
import Tiger01118.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01118")
    name = "Tiger01118"

    vcsRoot(Tiger01118_cVCSroot)

    buildType(Tiger01118_Hi2)
    buildType(Tiger01118_Hi3)
    buildType(Tiger01118_Hi0)
    buildType(Tiger01118_Hi1)
})

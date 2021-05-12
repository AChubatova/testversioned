package Tiger01743

import Tiger01743.buildTypes.*
import Tiger01743.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01743")
    name = "Tiger01743"

    vcsRoot(Tiger01743_cVCSroot)

    buildType(Tiger01743_Hi2)
    buildType(Tiger01743_Hi3)
    buildType(Tiger01743_Hi0)
    buildType(Tiger01743_Hi1)
})

package Tiger01417

import Tiger01417.buildTypes.*
import Tiger01417.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01417")
    name = "Tiger01417"

    vcsRoot(Tiger01417_cVCSroot)

    buildType(Tiger01417_Hi3)
    buildType(Tiger01417_Hi2)
    buildType(Tiger01417_Hi1)
    buildType(Tiger01417_Hi0)
})

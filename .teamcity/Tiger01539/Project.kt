package Tiger01539

import Tiger01539.buildTypes.*
import Tiger01539.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01539")
    name = "Tiger01539"

    vcsRoot(Tiger01539_cVCSroot)

    buildType(Tiger01539_Hi0)
    buildType(Tiger01539_Hi3)
    buildType(Tiger01539_Hi2)
    buildType(Tiger01539_Hi1)
})

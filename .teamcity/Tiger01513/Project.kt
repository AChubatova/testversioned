package Tiger01513

import Tiger01513.buildTypes.*
import Tiger01513.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01513")
    name = "Tiger01513"

    vcsRoot(Tiger01513_cVCSroot)

    buildType(Tiger01513_Hi2)
    buildType(Tiger01513_Hi1)
    buildType(Tiger01513_Hi3)
    buildType(Tiger01513_Hi0)
})

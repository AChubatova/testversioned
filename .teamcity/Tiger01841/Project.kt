package Tiger01841

import Tiger01841.buildTypes.*
import Tiger01841.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01841")
    name = "Tiger01841"

    vcsRoot(Tiger01841_cVCSroot)

    buildType(Tiger01841_Hi1)
    buildType(Tiger01841_Hi2)
    buildType(Tiger01841_Hi0)
    buildType(Tiger01841_Hi3)
})

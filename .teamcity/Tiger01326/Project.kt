package Tiger01326

import Tiger01326.buildTypes.*
import Tiger01326.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01326")
    name = "Tiger01326"

    vcsRoot(Tiger01326_cVCSroot)

    buildType(Tiger01326_Hi0)
    buildType(Tiger01326_Hi1)
    buildType(Tiger01326_Hi2)
    buildType(Tiger01326_Hi3)
})

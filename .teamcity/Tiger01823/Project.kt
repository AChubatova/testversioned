package Tiger01823

import Tiger01823.buildTypes.*
import Tiger01823.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01823")
    name = "Tiger01823"

    vcsRoot(Tiger01823_cVCSroot)

    buildType(Tiger01823_Hi3)
    buildType(Tiger01823_Hi0)
    buildType(Tiger01823_Hi1)
    buildType(Tiger01823_Hi2)
})

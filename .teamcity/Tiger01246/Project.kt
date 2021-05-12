package Tiger01246

import Tiger01246.buildTypes.*
import Tiger01246.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01246")
    name = "Tiger01246"

    vcsRoot(Tiger01246_cVCSroot)

    buildType(Tiger01246_Hi3)
    buildType(Tiger01246_Hi2)
    buildType(Tiger01246_Hi1)
    buildType(Tiger01246_Hi0)
})

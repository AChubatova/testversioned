package Tiger01110

import Tiger01110.buildTypes.*
import Tiger01110.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01110")
    name = "Tiger01110"

    vcsRoot(Tiger01110_cVCSroot)

    buildType(Tiger01110_Hi2)
    buildType(Tiger01110_Hi3)
    buildType(Tiger01110_Hi0)
    buildType(Tiger01110_Hi1)
})

package Tiger01149

import Tiger01149.buildTypes.*
import Tiger01149.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01149")
    name = "Tiger01149"

    vcsRoot(Tiger01149_cVCSroot)

    buildType(Tiger01149_Hi1)
    buildType(Tiger01149_Hi0)
    buildType(Tiger01149_Hi3)
    buildType(Tiger01149_Hi2)
})

package Tiger066

import Tiger066.buildTypes.*
import Tiger066.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger066")
    name = "Tiger066"

    vcsRoot(Tiger066_cVCSroot)

    buildType(Tiger066_Hi3)
    buildType(Tiger066_Hi2)
    buildType(Tiger066_Hi1)
    buildType(Tiger066_Hi0)
})

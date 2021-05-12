package Tiger01448

import Tiger01448.buildTypes.*
import Tiger01448.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01448")
    name = "Tiger01448"

    vcsRoot(Tiger01448_cVCSroot)

    buildType(Tiger01448_Hi0)
    buildType(Tiger01448_Hi1)
    buildType(Tiger01448_Hi2)
    buildType(Tiger01448_Hi3)
})

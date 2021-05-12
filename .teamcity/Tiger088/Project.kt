package Tiger088

import Tiger088.buildTypes.*
import Tiger088.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger088")
    name = "Tiger088"

    vcsRoot(Tiger088_cVCSroot)

    buildType(Tiger088_Hi3)
    buildType(Tiger088_Hi0)
    buildType(Tiger088_Hi2)
    buildType(Tiger088_Hi1)
})

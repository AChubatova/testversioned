package Tiger091

import Tiger091.buildTypes.*
import Tiger091.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger091")
    name = "Tiger091"

    vcsRoot(Tiger091_cVCSroot)

    buildType(Tiger091_Hi0)
    buildType(Tiger091_Hi1)
    buildType(Tiger091_Hi2)
    buildType(Tiger091_Hi3)
})

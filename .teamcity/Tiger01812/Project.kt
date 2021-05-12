package Tiger01812

import Tiger01812.buildTypes.*
import Tiger01812.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01812")
    name = "Tiger01812"

    vcsRoot(Tiger01812_cVCSroot)

    buildType(Tiger01812_Hi0)
    buildType(Tiger01812_Hi2)
    buildType(Tiger01812_Hi1)
    buildType(Tiger01812_Hi3)
})

package Tiger01030

import Tiger01030.buildTypes.*
import Tiger01030.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01030")
    name = "Tiger01030"

    vcsRoot(Tiger01030_cVCSroot)

    buildType(Tiger01030_Hi0)
    buildType(Tiger01030_Hi2)
    buildType(Tiger01030_Hi1)
    buildType(Tiger01030_Hi3)
})

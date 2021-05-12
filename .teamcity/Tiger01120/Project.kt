package Tiger01120

import Tiger01120.buildTypes.*
import Tiger01120.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01120")
    name = "Tiger01120"

    vcsRoot(Tiger01120_cVCSroot)

    buildType(Tiger01120_Hi0)
    buildType(Tiger01120_Hi3)
    buildType(Tiger01120_Hi2)
    buildType(Tiger01120_Hi1)
})

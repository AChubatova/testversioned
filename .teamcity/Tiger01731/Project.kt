package Tiger01731

import Tiger01731.buildTypes.*
import Tiger01731.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01731")
    name = "Tiger01731"

    vcsRoot(Tiger01731_cVCSroot)

    buildType(Tiger01731_Hi2)
    buildType(Tiger01731_Hi1)
    buildType(Tiger01731_Hi0)
    buildType(Tiger01731_Hi3)
})

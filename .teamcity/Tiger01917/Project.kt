package Tiger01917

import Tiger01917.buildTypes.*
import Tiger01917.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01917")
    name = "Tiger01917"

    vcsRoot(Tiger01917_cVCSroot)

    buildType(Tiger01917_Hi0)
    buildType(Tiger01917_Hi3)
    buildType(Tiger01917_Hi1)
    buildType(Tiger01917_Hi2)
})

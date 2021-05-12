package Tiger01021

import Tiger01021.buildTypes.*
import Tiger01021.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01021")
    name = "Tiger01021"

    vcsRoot(Tiger01021_cVCSroot)

    buildType(Tiger01021_Hi3)
    buildType(Tiger01021_Hi1)
    buildType(Tiger01021_Hi2)
    buildType(Tiger01021_Hi0)
})

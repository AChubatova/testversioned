package Tiger01610

import Tiger01610.buildTypes.*
import Tiger01610.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01610")
    name = "Tiger01610"

    vcsRoot(Tiger01610_cVCSroot)

    buildType(Tiger01610_Hi3)
    buildType(Tiger01610_Hi0)
    buildType(Tiger01610_Hi2)
    buildType(Tiger01610_Hi1)
})

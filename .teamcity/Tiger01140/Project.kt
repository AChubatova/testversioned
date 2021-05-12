package Tiger01140

import Tiger01140.buildTypes.*
import Tiger01140.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01140")
    name = "Tiger01140"

    vcsRoot(Tiger01140_cVCSroot)

    buildType(Tiger01140_Hi0)
    buildType(Tiger01140_Hi1)
    buildType(Tiger01140_Hi2)
    buildType(Tiger01140_Hi3)
})

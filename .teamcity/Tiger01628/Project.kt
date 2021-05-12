package Tiger01628

import Tiger01628.buildTypes.*
import Tiger01628.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01628")
    name = "Tiger01628"

    vcsRoot(Tiger01628_cVCSroot)

    buildType(Tiger01628_Hi2)
    buildType(Tiger01628_Hi3)
    buildType(Tiger01628_Hi0)
    buildType(Tiger01628_Hi1)
})

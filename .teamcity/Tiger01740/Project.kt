package Tiger01740

import Tiger01740.buildTypes.*
import Tiger01740.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01740")
    name = "Tiger01740"

    vcsRoot(Tiger01740_cVCSroot)

    buildType(Tiger01740_Hi3)
    buildType(Tiger01740_Hi1)
    buildType(Tiger01740_Hi2)
    buildType(Tiger01740_Hi0)
})

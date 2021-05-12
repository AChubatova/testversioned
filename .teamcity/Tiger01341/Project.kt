package Tiger01341

import Tiger01341.buildTypes.*
import Tiger01341.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01341")
    name = "Tiger01341"

    vcsRoot(Tiger01341_cVCSroot)

    buildType(Tiger01341_Hi3)
    buildType(Tiger01341_Hi2)
    buildType(Tiger01341_Hi1)
    buildType(Tiger01341_Hi0)
})

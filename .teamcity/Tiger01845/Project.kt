package Tiger01845

import Tiger01845.buildTypes.*
import Tiger01845.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01845")
    name = "Tiger01845"

    vcsRoot(Tiger01845_cVCSroot)

    buildType(Tiger01845_Hi1)
    buildType(Tiger01845_Hi2)
    buildType(Tiger01845_Hi0)
    buildType(Tiger01845_Hi3)
})

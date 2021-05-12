package Tiger01212

import Tiger01212.buildTypes.*
import Tiger01212.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01212")
    name = "Tiger01212"

    vcsRoot(Tiger01212_cVCSroot)

    buildType(Tiger01212_Hi1)
    buildType(Tiger01212_Hi2)
    buildType(Tiger01212_Hi3)
    buildType(Tiger01212_Hi0)
})

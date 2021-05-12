package Tiger01215

import Tiger01215.buildTypes.*
import Tiger01215.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01215")
    name = "Tiger01215"

    vcsRoot(Tiger01215_cVCSroot)

    buildType(Tiger01215_Hi0)
    buildType(Tiger01215_Hi1)
    buildType(Tiger01215_Hi2)
    buildType(Tiger01215_Hi3)
})

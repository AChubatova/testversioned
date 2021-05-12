package Tiger01322

import Tiger01322.buildTypes.*
import Tiger01322.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01322")
    name = "Tiger01322"

    vcsRoot(Tiger01322_cVCSroot)

    buildType(Tiger01322_Hi3)
    buildType(Tiger01322_Hi2)
    buildType(Tiger01322_Hi1)
    buildType(Tiger01322_Hi0)
})

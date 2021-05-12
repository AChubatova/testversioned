package Tiger01528

import Tiger01528.buildTypes.*
import Tiger01528.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01528")
    name = "Tiger01528"

    vcsRoot(Tiger01528_cVCSroot)

    buildType(Tiger01528_Hi0)
    buildType(Tiger01528_Hi1)
    buildType(Tiger01528_Hi2)
    buildType(Tiger01528_Hi3)
})

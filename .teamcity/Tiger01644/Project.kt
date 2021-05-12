package Tiger01644

import Tiger01644.buildTypes.*
import Tiger01644.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01644")
    name = "Tiger01644"

    vcsRoot(Tiger01644_cVCSroot)

    buildType(Tiger01644_Hi0)
    buildType(Tiger01644_Hi1)
    buildType(Tiger01644_Hi2)
    buildType(Tiger01644_Hi3)
})

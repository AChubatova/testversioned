package Tiger01012

import Tiger01012.buildTypes.*
import Tiger01012.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01012")
    name = "Tiger01012"

    vcsRoot(Tiger01012_cVCSroot)

    buildType(Tiger01012_Hi0)
    buildType(Tiger01012_Hi1)
    buildType(Tiger01012_Hi2)
    buildType(Tiger01012_Hi3)
})

package Tiger01530

import Tiger01530.buildTypes.*
import Tiger01530.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01530")
    name = "Tiger01530"

    vcsRoot(Tiger01530_cVCSroot)

    buildType(Tiger01530_Hi2)
    buildType(Tiger01530_Hi3)
    buildType(Tiger01530_Hi0)
    buildType(Tiger01530_Hi1)
})

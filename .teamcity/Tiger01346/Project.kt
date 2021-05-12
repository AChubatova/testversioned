package Tiger01346

import Tiger01346.buildTypes.*
import Tiger01346.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01346")
    name = "Tiger01346"

    vcsRoot(Tiger01346_cVCSroot)

    buildType(Tiger01346_Hi3)
    buildType(Tiger01346_Hi0)
    buildType(Tiger01346_Hi2)
    buildType(Tiger01346_Hi1)
})

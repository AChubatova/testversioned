package Tiger085

import Tiger085.buildTypes.*
import Tiger085.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger085")
    name = "Tiger085"

    vcsRoot(Tiger085_cVCSroot)

    buildType(Tiger085_Hi1)
    buildType(Tiger085_Hi0)
    buildType(Tiger085_Hi3)
    buildType(Tiger085_Hi2)
})

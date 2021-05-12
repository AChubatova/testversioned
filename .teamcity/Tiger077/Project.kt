package Tiger077

import Tiger077.buildTypes.*
import Tiger077.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger077")
    name = "Tiger077"

    vcsRoot(Tiger077_cVCSroot)

    buildType(Tiger077_Hi1)
    buildType(Tiger077_Hi2)
    buildType(Tiger077_Hi0)
    buildType(Tiger077_Hi3)
})

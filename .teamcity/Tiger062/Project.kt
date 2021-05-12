package Tiger062

import Tiger062.buildTypes.*
import Tiger062.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger062")
    name = "Tiger062"

    vcsRoot(Tiger062_cVCSroot)

    buildType(Tiger062_Hi3)
    buildType(Tiger062_Hi2)
    buildType(Tiger062_Hi1)
    buildType(Tiger062_Hi0)
})

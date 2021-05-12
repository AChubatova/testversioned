package Tiger0642

import Tiger0642.buildTypes.*
import Tiger0642.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0642")
    name = "Tiger0642"

    vcsRoot(Tiger0642_cVCSroot)

    buildType(Tiger0642_Hi0)
    buildType(Tiger0642_Hi3)
    buildType(Tiger0642_Hi2)
    buildType(Tiger0642_Hi1)
})

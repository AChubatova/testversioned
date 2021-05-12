package Tiger0435

import Tiger0435.buildTypes.*
import Tiger0435.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0435")
    name = "Tiger0435"

    vcsRoot(Tiger0435_cVCSroot)

    buildType(Tiger0435_Hi3)
    buildType(Tiger0435_Hi0)
    buildType(Tiger0435_Hi1)
    buildType(Tiger0435_Hi2)
})

package Tiger0544

import Tiger0544.buildTypes.*
import Tiger0544.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0544")
    name = "Tiger0544"

    vcsRoot(Tiger0544_cVCSroot)

    buildType(Tiger0544_Hi1)
    buildType(Tiger0544_Hi0)
    buildType(Tiger0544_Hi3)
    buildType(Tiger0544_Hi2)
})

package Tiger0531

import Tiger0531.buildTypes.*
import Tiger0531.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0531")
    name = "Tiger0531"

    vcsRoot(Tiger0531_cVCSroot)

    buildType(Tiger0531_Hi0)
    buildType(Tiger0531_Hi1)
    buildType(Tiger0531_Hi2)
    buildType(Tiger0531_Hi3)
})

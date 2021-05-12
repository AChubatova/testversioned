package Tiger0943

import Tiger0943.buildTypes.*
import Tiger0943.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0943")
    name = "Tiger0943"

    vcsRoot(Tiger0943_cVCSroot)

    buildType(Tiger0943_Hi0)
    buildType(Tiger0943_Hi1)
    buildType(Tiger0943_Hi2)
    buildType(Tiger0943_Hi3)
})

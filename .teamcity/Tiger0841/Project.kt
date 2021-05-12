package Tiger0841

import Tiger0841.buildTypes.*
import Tiger0841.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0841")
    name = "Tiger0841"

    vcsRoot(Tiger0841_cVCSroot)

    buildType(Tiger0841_Hi2)
    buildType(Tiger0841_Hi3)
    buildType(Tiger0841_Hi0)
    buildType(Tiger0841_Hi1)
})

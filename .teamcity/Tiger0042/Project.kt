package Tiger0042

import Tiger0042.buildTypes.*
import Tiger0042.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0042")
    name = "Tiger0042"

    vcsRoot(Tiger0042_cVCSroot)

    buildType(Tiger0042_Hi1)
    buildType(Tiger0042_Hi2)
    buildType(Tiger0042_Hi0)
    buildType(Tiger0042_Hi3)
})

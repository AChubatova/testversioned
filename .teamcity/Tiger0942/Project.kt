package Tiger0942

import Tiger0942.buildTypes.*
import Tiger0942.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0942")
    name = "Tiger0942"

    vcsRoot(Tiger0942_cVCSroot)

    buildType(Tiger0942_Hi0)
    buildType(Tiger0942_Hi1)
    buildType(Tiger0942_Hi2)
    buildType(Tiger0942_Hi3)
})

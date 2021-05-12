package Tiger0320

import Tiger0320.buildTypes.*
import Tiger0320.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0320")
    name = "Tiger0320"

    vcsRoot(Tiger0320_cVCSroot)

    buildType(Tiger0320_Hi3)
    buildType(Tiger0320_Hi2)
    buildType(Tiger0320_Hi1)
    buildType(Tiger0320_Hi0)
})

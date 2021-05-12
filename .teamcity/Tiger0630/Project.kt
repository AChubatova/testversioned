package Tiger0630

import Tiger0630.buildTypes.*
import Tiger0630.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0630")
    name = "Tiger0630"

    vcsRoot(Tiger0630_cVCSroot)

    buildType(Tiger0630_Hi0)
    buildType(Tiger0630_Hi1)
    buildType(Tiger0630_Hi2)
    buildType(Tiger0630_Hi3)
})

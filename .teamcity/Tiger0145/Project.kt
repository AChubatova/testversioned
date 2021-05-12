package Tiger0145

import Tiger0145.buildTypes.*
import Tiger0145.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0145")
    name = "Tiger0145"

    vcsRoot(Tiger0145_cVCSroot)

    buildType(Tiger0145_Hi3)
    buildType(Tiger0145_Hi1)
    buildType(Tiger0145_Hi2)
    buildType(Tiger0145_Hi0)
})

package Tiger0135

import Tiger0135.buildTypes.*
import Tiger0135.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0135")
    name = "Tiger0135"

    vcsRoot(Tiger0135_cVCSroot)

    buildType(Tiger0135_Hi0)
    buildType(Tiger0135_Hi1)
    buildType(Tiger0135_Hi2)
    buildType(Tiger0135_Hi3)
})

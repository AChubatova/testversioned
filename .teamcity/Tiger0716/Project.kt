package Tiger0716

import Tiger0716.buildTypes.*
import Tiger0716.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0716")
    name = "Tiger0716"

    vcsRoot(Tiger0716_cVCSroot)

    buildType(Tiger0716_Hi0)
    buildType(Tiger0716_Hi3)
    buildType(Tiger0716_Hi2)
    buildType(Tiger0716_Hi1)
})

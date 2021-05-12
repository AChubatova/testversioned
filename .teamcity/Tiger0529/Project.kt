package Tiger0529

import Tiger0529.buildTypes.*
import Tiger0529.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0529")
    name = "Tiger0529"

    vcsRoot(Tiger0529_cVCSroot)

    buildType(Tiger0529_Hi3)
    buildType(Tiger0529_Hi1)
    buildType(Tiger0529_Hi2)
    buildType(Tiger0529_Hi0)
})

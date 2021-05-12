package Tiger0937

import Tiger0937.buildTypes.*
import Tiger0937.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0937")
    name = "Tiger0937"

    vcsRoot(Tiger0937_cVCSroot)

    buildType(Tiger0937_Hi0)
    buildType(Tiger0937_Hi1)
    buildType(Tiger0937_Hi2)
    buildType(Tiger0937_Hi3)
})

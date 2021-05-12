package Tiger0430

import Tiger0430.buildTypes.*
import Tiger0430.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0430")
    name = "Tiger0430"

    vcsRoot(Tiger0430_cVCSroot)

    buildType(Tiger0430_Hi2)
    buildType(Tiger0430_Hi3)
    buildType(Tiger0430_Hi0)
    buildType(Tiger0430_Hi1)
})

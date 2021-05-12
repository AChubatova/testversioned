package Tiger0169

import Tiger0169.buildTypes.*
import Tiger0169.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0169")
    name = "Tiger0169"

    vcsRoot(Tiger0169_cVCSroot)

    buildType(Tiger0169_Hi0)
    buildType(Tiger0169_Hi1)
    buildType(Tiger0169_Hi2)
    buildType(Tiger0169_Hi3)
})

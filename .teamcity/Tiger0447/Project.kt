package Tiger0447

import Tiger0447.buildTypes.*
import Tiger0447.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0447")
    name = "Tiger0447"

    vcsRoot(Tiger0447_cVCSroot)

    buildType(Tiger0447_Hi3)
    buildType(Tiger0447_Hi2)
    buildType(Tiger0447_Hi1)
    buildType(Tiger0447_Hi0)
})

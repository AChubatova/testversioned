package Tiger0440

import Tiger0440.buildTypes.*
import Tiger0440.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0440")
    name = "Tiger0440"

    vcsRoot(Tiger0440_cVCSroot)

    buildType(Tiger0440_Hi0)
    buildType(Tiger0440_Hi3)
    buildType(Tiger0440_Hi2)
    buildType(Tiger0440_Hi1)
})

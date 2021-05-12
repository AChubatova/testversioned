package Tiger0100

import Tiger0100.buildTypes.*
import Tiger0100.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0100")
    name = "Tiger0100"

    vcsRoot(Tiger0100_cVCSroot)

    buildType(Tiger0100_Hi1)
    buildType(Tiger0100_Hi0)
    buildType(Tiger0100_Hi3)
    buildType(Tiger0100_Hi2)
})

package Tiger0648

import Tiger0648.buildTypes.*
import Tiger0648.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0648")
    name = "Tiger0648"

    vcsRoot(Tiger0648_cVCSroot)

    buildType(Tiger0648_Hi0)
    buildType(Tiger0648_Hi1)
    buildType(Tiger0648_Hi2)
    buildType(Tiger0648_Hi3)
})

package Tiger0175

import Tiger0175.buildTypes.*
import Tiger0175.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0175")
    name = "Tiger0175"

    vcsRoot(Tiger0175_cVCSroot)

    buildType(Tiger0175_Hi1)
    buildType(Tiger0175_Hi0)
    buildType(Tiger0175_Hi3)
    buildType(Tiger0175_Hi2)
})

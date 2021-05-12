package Tiger0330

import Tiger0330.buildTypes.*
import Tiger0330.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0330")
    name = "Tiger0330"

    vcsRoot(Tiger0330_cVCSroot)

    buildType(Tiger0330_Hi1)
    buildType(Tiger0330_Hi2)
    buildType(Tiger0330_Hi3)
    buildType(Tiger0330_Hi0)
})

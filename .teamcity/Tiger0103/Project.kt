package Tiger0103

import Tiger0103.buildTypes.*
import Tiger0103.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0103")
    name = "Tiger0103"

    vcsRoot(Tiger0103_cVCSroot)

    buildType(Tiger0103_Hi3)
    buildType(Tiger0103_Hi2)
    buildType(Tiger0103_Hi1)
    buildType(Tiger0103_Hi0)
})

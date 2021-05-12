package Tiger0914

import Tiger0914.buildTypes.*
import Tiger0914.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0914")
    name = "Tiger0914"

    vcsRoot(Tiger0914_cVCSroot)

    buildType(Tiger0914_Hi1)
    buildType(Tiger0914_Hi2)
    buildType(Tiger0914_Hi3)
    buildType(Tiger0914_Hi0)
})

package Tiger0149

import Tiger0149.buildTypes.*
import Tiger0149.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0149")
    name = "Tiger0149"

    vcsRoot(Tiger0149_cVCSroot)

    buildType(Tiger0149_Hi2)
    buildType(Tiger0149_Hi1)
    buildType(Tiger0149_Hi0)
    buildType(Tiger0149_Hi3)
})

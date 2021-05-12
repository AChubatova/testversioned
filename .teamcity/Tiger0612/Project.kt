package Tiger0612

import Tiger0612.buildTypes.*
import Tiger0612.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0612")
    name = "Tiger0612"

    vcsRoot(Tiger0612_cVCSroot)

    buildType(Tiger0612_Hi1)
    buildType(Tiger0612_Hi0)
    buildType(Tiger0612_Hi3)
    buildType(Tiger0612_Hi2)
})

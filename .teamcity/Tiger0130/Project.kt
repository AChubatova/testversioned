package Tiger0130

import Tiger0130.buildTypes.*
import Tiger0130.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0130")
    name = "Tiger0130"

    vcsRoot(Tiger0130_cVCSroot)

    buildType(Tiger0130_Hi3)
    buildType(Tiger0130_Hi2)
    buildType(Tiger0130_Hi1)
    buildType(Tiger0130_Hi0)
})

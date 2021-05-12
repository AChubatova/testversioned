package Tiger0108

import Tiger0108.buildTypes.*
import Tiger0108.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0108")
    name = "Tiger0108"

    vcsRoot(Tiger0108_cVCSroot)

    buildType(Tiger0108_Hi1)
    buildType(Tiger0108_Hi0)
    buildType(Tiger0108_Hi3)
    buildType(Tiger0108_Hi2)
})

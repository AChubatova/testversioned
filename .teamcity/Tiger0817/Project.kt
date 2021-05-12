package Tiger0817

import Tiger0817.buildTypes.*
import Tiger0817.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0817")
    name = "Tiger0817"

    vcsRoot(Tiger0817_cVCSroot)

    buildType(Tiger0817_Hi0)
    buildType(Tiger0817_Hi1)
    buildType(Tiger0817_Hi2)
    buildType(Tiger0817_Hi3)
})

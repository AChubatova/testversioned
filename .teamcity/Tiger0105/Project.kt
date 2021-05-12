package Tiger0105

import Tiger0105.buildTypes.*
import Tiger0105.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0105")
    name = "Tiger0105"

    vcsRoot(Tiger0105_cVCSroot)

    buildType(Tiger0105_Hi3)
    buildType(Tiger0105_Hi2)
    buildType(Tiger0105_Hi1)
    buildType(Tiger0105_Hi0)
})

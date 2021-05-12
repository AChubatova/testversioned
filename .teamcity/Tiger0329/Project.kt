package Tiger0329

import Tiger0329.buildTypes.*
import Tiger0329.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0329")
    name = "Tiger0329"

    vcsRoot(Tiger0329_cVCSroot)

    buildType(Tiger0329_Hi0)
    buildType(Tiger0329_Hi2)
    buildType(Tiger0329_Hi1)
    buildType(Tiger0329_Hi3)
})

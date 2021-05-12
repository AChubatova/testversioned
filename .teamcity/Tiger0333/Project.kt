package Tiger0333

import Tiger0333.buildTypes.*
import Tiger0333.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0333")
    name = "Tiger0333"

    vcsRoot(Tiger0333_cVCSroot)

    buildType(Tiger0333_Hi0)
    buildType(Tiger0333_Hi1)
    buildType(Tiger0333_Hi2)
    buildType(Tiger0333_Hi3)
})

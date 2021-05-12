package Tiger0158

import Tiger0158.buildTypes.*
import Tiger0158.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0158")
    name = "Tiger0158"

    vcsRoot(Tiger0158_cVCSroot)

    buildType(Tiger0158_Hi2)
    buildType(Tiger0158_Hi1)
    buildType(Tiger0158_Hi3)
    buildType(Tiger0158_Hi0)
})

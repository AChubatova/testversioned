package Tiger0143

import Tiger0143.buildTypes.*
import Tiger0143.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0143")
    name = "Tiger0143"

    vcsRoot(Tiger0143_cVCSroot)

    buildType(Tiger0143_Hi3)
    buildType(Tiger0143_Hi1)
    buildType(Tiger0143_Hi2)
    buildType(Tiger0143_Hi0)
})

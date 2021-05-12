package Tiger0121

import Tiger0121.buildTypes.*
import Tiger0121.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0121")
    name = "Tiger0121"

    vcsRoot(Tiger0121_cVCSroot)

    buildType(Tiger0121_Hi0)
    buildType(Tiger0121_Hi1)
    buildType(Tiger0121_Hi2)
    buildType(Tiger0121_Hi3)
})

package Tiger0138

import Tiger0138.buildTypes.*
import Tiger0138.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0138")
    name = "Tiger0138"

    vcsRoot(Tiger0138_cVCSroot)

    buildType(Tiger0138_Hi0)
    buildType(Tiger0138_Hi1)
    buildType(Tiger0138_Hi2)
    buildType(Tiger0138_Hi3)
})

package Tiger0176

import Tiger0176.buildTypes.*
import Tiger0176.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0176")
    name = "Tiger0176"

    vcsRoot(Tiger0176_cVCSroot)

    buildType(Tiger0176_Hi0)
    buildType(Tiger0176_Hi3)
    buildType(Tiger0176_Hi2)
    buildType(Tiger0176_Hi1)
})

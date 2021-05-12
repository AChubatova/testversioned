package Tiger0621

import Tiger0621.buildTypes.*
import Tiger0621.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0621")
    name = "Tiger0621"

    vcsRoot(Tiger0621_cVCSroot)

    buildType(Tiger0621_Hi3)
    buildType(Tiger0621_Hi2)
    buildType(Tiger0621_Hi1)
    buildType(Tiger0621_Hi0)
})

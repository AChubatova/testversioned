package Tiger0815

import Tiger0815.buildTypes.*
import Tiger0815.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0815")
    name = "Tiger0815"

    vcsRoot(Tiger0815_cVCSroot)

    buildType(Tiger0815_Hi0)
    buildType(Tiger0815_Hi3)
    buildType(Tiger0815_Hi2)
    buildType(Tiger0815_Hi1)
})

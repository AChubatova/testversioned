package Tiger0627

import Tiger0627.buildTypes.*
import Tiger0627.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0627")
    name = "Tiger0627"

    vcsRoot(Tiger0627_cVCSroot)

    buildType(Tiger0627_Hi0)
    buildType(Tiger0627_Hi1)
    buildType(Tiger0627_Hi2)
    buildType(Tiger0627_Hi3)
})

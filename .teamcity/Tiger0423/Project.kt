package Tiger0423

import Tiger0423.buildTypes.*
import Tiger0423.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0423")
    name = "Tiger0423"

    vcsRoot(Tiger0423_cVCSroot)

    buildType(Tiger0423_Hi3)
    buildType(Tiger0423_Hi2)
    buildType(Tiger0423_Hi1)
    buildType(Tiger0423_Hi0)
})

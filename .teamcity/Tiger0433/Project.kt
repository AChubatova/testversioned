package Tiger0433

import Tiger0433.buildTypes.*
import Tiger0433.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0433")
    name = "Tiger0433"

    vcsRoot(Tiger0433_cVCSroot)

    buildType(Tiger0433_Hi0)
    buildType(Tiger0433_Hi1)
    buildType(Tiger0433_Hi2)
    buildType(Tiger0433_Hi3)
})

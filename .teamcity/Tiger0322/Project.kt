package Tiger0322

import Tiger0322.buildTypes.*
import Tiger0322.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0322")
    name = "Tiger0322"

    vcsRoot(Tiger0322_cVCSroot)

    buildType(Tiger0322_Hi3)
    buildType(Tiger0322_Hi2)
    buildType(Tiger0322_Hi1)
    buildType(Tiger0322_Hi0)
})

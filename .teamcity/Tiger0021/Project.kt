package Tiger0021

import Tiger0021.buildTypes.*
import Tiger0021.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0021")
    name = "Tiger0021"

    vcsRoot(Tiger0021_cVCSroot)

    buildType(Tiger0021_Hi2)
    buildType(Tiger0021_Hi3)
    buildType(Tiger0021_Hi0)
    buildType(Tiger0021_Hi1)
})

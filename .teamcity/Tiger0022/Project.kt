package Tiger0022

import Tiger0022.buildTypes.*
import Tiger0022.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0022")
    name = "Tiger0022"

    vcsRoot(Tiger0022_cVCSroot)

    buildType(Tiger0022_Hi1)
    buildType(Tiger0022_Hi2)
    buildType(Tiger0022_Hi3)
    buildType(Tiger0022_Hi0)
})

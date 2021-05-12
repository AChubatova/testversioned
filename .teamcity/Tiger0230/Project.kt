package Tiger0230

import Tiger0230.buildTypes.*
import Tiger0230.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0230")
    name = "Tiger0230"

    vcsRoot(Tiger0230_cVCSroot)

    buildType(Tiger0230_Hi1)
    buildType(Tiger0230_Hi0)
    buildType(Tiger0230_Hi3)
    buildType(Tiger0230_Hi2)
})

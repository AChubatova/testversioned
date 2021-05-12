package Tiger0830

import Tiger0830.buildTypes.*
import Tiger0830.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0830")
    name = "Tiger0830"

    vcsRoot(Tiger0830_cVCSroot)

    buildType(Tiger0830_Hi3)
    buildType(Tiger0830_Hi2)
    buildType(Tiger0830_Hi1)
    buildType(Tiger0830_Hi0)
})

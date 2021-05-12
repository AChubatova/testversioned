package Tiger075

import Tiger075.buildTypes.*
import Tiger075.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger075")
    name = "Tiger075"

    vcsRoot(Tiger075_cVCSroot)

    buildType(Tiger075_Hi3)
    buildType(Tiger075_Hi1)
    buildType(Tiger075_Hi2)
    buildType(Tiger075_Hi0)
})

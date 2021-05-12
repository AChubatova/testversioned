package Tiger01143

import Tiger01143.buildTypes.*
import Tiger01143.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01143")
    name = "Tiger01143"

    vcsRoot(Tiger01143_cVCSroot)

    buildType(Tiger01143_Hi2)
    buildType(Tiger01143_Hi3)
    buildType(Tiger01143_Hi0)
    buildType(Tiger01143_Hi1)
})

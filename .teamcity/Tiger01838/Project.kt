package Tiger01838

import Tiger01838.buildTypes.*
import Tiger01838.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01838")
    name = "Tiger01838"

    vcsRoot(Tiger01838_cVCSroot)

    buildType(Tiger01838_Hi3)
    buildType(Tiger01838_Hi0)
    buildType(Tiger01838_Hi1)
    buildType(Tiger01838_Hi2)
})

package Tiger0173

import Tiger0173.buildTypes.*
import Tiger0173.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0173")
    name = "Tiger0173"

    vcsRoot(Tiger0173_cVCSroot)

    buildType(Tiger0173_Hi1)
    buildType(Tiger0173_Hi0)
    buildType(Tiger0173_Hi3)
    buildType(Tiger0173_Hi2)
})

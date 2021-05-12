package Tiger0245

import Tiger0245.buildTypes.*
import Tiger0245.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0245")
    name = "Tiger0245"

    vcsRoot(Tiger0245_cVCSroot)

    buildType(Tiger0245_Hi3)
    buildType(Tiger0245_Hi2)
    buildType(Tiger0245_Hi1)
    buildType(Tiger0245_Hi0)
})

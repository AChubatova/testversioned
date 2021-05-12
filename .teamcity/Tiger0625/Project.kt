package Tiger0625

import Tiger0625.buildTypes.*
import Tiger0625.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0625")
    name = "Tiger0625"

    vcsRoot(Tiger0625_cVCSroot)

    buildType(Tiger0625_Hi0)
    buildType(Tiger0625_Hi1)
    buildType(Tiger0625_Hi2)
    buildType(Tiger0625_Hi3)
})

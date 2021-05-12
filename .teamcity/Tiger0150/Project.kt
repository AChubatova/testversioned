package Tiger0150

import Tiger0150.buildTypes.*
import Tiger0150.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0150")
    name = "Tiger0150"

    vcsRoot(Tiger0150_cVCSroot)

    buildType(Tiger0150_Hi2)
    buildType(Tiger0150_Hi1)
    buildType(Tiger0150_Hi3)
    buildType(Tiger0150_Hi0)
})

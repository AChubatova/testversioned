package Tiger0234

import Tiger0234.buildTypes.*
import Tiger0234.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0234")
    name = "Tiger0234"

    vcsRoot(Tiger0234_cVCSroot)

    buildType(Tiger0234_Hi0)
    buildType(Tiger0234_Hi1)
    buildType(Tiger0234_Hi2)
    buildType(Tiger0234_Hi3)
})

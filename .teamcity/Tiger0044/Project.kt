package Tiger0044

import Tiger0044.buildTypes.*
import Tiger0044.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0044")
    name = "Tiger0044"

    vcsRoot(Tiger0044_cVCSroot)

    buildType(Tiger0044_Hi0)
    buildType(Tiger0044_Hi3)
    buildType(Tiger0044_Hi1)
    buildType(Tiger0044_Hi2)
})

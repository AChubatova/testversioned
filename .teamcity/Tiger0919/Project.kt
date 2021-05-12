package Tiger0919

import Tiger0919.buildTypes.*
import Tiger0919.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0919")
    name = "Tiger0919"

    vcsRoot(Tiger0919_cVCSroot)

    buildType(Tiger0919_Hi2)
    buildType(Tiger0919_Hi3)
    buildType(Tiger0919_Hi0)
    buildType(Tiger0919_Hi1)
})

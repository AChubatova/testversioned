package Tiger0221

import Tiger0221.buildTypes.*
import Tiger0221.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0221")
    name = "Tiger0221"

    vcsRoot(Tiger0221_cVCSroot)

    buildType(Tiger0221_Hi3)
    buildType(Tiger0221_Hi2)
    buildType(Tiger0221_Hi1)
    buildType(Tiger0221_Hi0)
})

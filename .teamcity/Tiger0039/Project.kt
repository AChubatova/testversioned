package Tiger0039

import Tiger0039.buildTypes.*
import Tiger0039.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0039")
    name = "Tiger0039"

    vcsRoot(Tiger0039_cVCSroot)

    buildType(Tiger0039_Hi3)
    buildType(Tiger0039_Hi0)
    buildType(Tiger0039_Hi1)
    buildType(Tiger0039_Hi2)
})

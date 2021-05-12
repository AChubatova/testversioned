package Tiger0923

import Tiger0923.buildTypes.*
import Tiger0923.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0923")
    name = "Tiger0923"

    vcsRoot(Tiger0923_cVCSroot)

    buildType(Tiger0923_Hi1)
    buildType(Tiger0923_Hi2)
    buildType(Tiger0923_Hi0)
    buildType(Tiger0923_Hi3)
})

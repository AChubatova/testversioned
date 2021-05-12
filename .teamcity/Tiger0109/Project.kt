package Tiger0109

import Tiger0109.buildTypes.*
import Tiger0109.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0109")
    name = "Tiger0109"

    vcsRoot(Tiger0109_cVCSroot)

    buildType(Tiger0109_Hi2)
    buildType(Tiger0109_Hi1)
    buildType(Tiger0109_Hi0)
    buildType(Tiger0109_Hi3)
})

package Tiger0107

import Tiger0107.buildTypes.*
import Tiger0107.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0107")
    name = "Tiger0107"

    vcsRoot(Tiger0107_cVCSroot)

    buildType(Tiger0107_Hi0)
    buildType(Tiger0107_Hi3)
    buildType(Tiger0107_Hi2)
    buildType(Tiger0107_Hi1)
})

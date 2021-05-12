package Tiger0187

import Tiger0187.buildTypes.*
import Tiger0187.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0187")
    name = "Tiger0187"

    vcsRoot(Tiger0187_cVCSroot)

    buildType(Tiger0187_Hi0)
    buildType(Tiger0187_Hi3)
    buildType(Tiger0187_Hi1)
    buildType(Tiger0187_Hi2)
})

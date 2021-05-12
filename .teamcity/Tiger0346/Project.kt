package Tiger0346

import Tiger0346.buildTypes.*
import Tiger0346.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0346")
    name = "Tiger0346"

    vcsRoot(Tiger0346_cVCSroot)

    buildType(Tiger0346_Hi1)
    buildType(Tiger0346_Hi0)
    buildType(Tiger0346_Hi3)
    buildType(Tiger0346_Hi2)
})

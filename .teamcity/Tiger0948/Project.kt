package Tiger0948

import Tiger0948.buildTypes.*
import Tiger0948.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0948")
    name = "Tiger0948"

    vcsRoot(Tiger0948_cVCSroot)

    buildType(Tiger0948_Hi2)
    buildType(Tiger0948_Hi3)
    buildType(Tiger0948_Hi0)
    buildType(Tiger0948_Hi1)
})

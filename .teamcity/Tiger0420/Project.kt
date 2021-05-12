package Tiger0420

import Tiger0420.buildTypes.*
import Tiger0420.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0420")
    name = "Tiger0420"

    vcsRoot(Tiger0420_cVCSroot)

    buildType(Tiger0420_Hi0)
    buildType(Tiger0420_Hi2)
    buildType(Tiger0420_Hi1)
    buildType(Tiger0420_Hi3)
})

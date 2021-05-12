package Tiger0137

import Tiger0137.buildTypes.*
import Tiger0137.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0137")
    name = "Tiger0137"

    vcsRoot(Tiger0137_cVCSroot)

    buildType(Tiger0137_Hi2)
    buildType(Tiger0137_Hi3)
    buildType(Tiger0137_Hi0)
    buildType(Tiger0137_Hi1)
})

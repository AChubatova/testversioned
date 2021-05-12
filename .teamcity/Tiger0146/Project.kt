package Tiger0146

import Tiger0146.buildTypes.*
import Tiger0146.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0146")
    name = "Tiger0146"

    vcsRoot(Tiger0146_cVCSroot)

    buildType(Tiger0146_Hi2)
    buildType(Tiger0146_Hi3)
    buildType(Tiger0146_Hi0)
    buildType(Tiger0146_Hi1)
})

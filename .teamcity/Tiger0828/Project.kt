package Tiger0828

import Tiger0828.buildTypes.*
import Tiger0828.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0828")
    name = "Tiger0828"

    vcsRoot(Tiger0828_cVCSroot)

    buildType(Tiger0828_Hi2)
    buildType(Tiger0828_Hi1)
    buildType(Tiger0828_Hi0)
    buildType(Tiger0828_Hi3)
})

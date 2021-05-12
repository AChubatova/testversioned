package Tiger0839

import Tiger0839.buildTypes.*
import Tiger0839.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0839")
    name = "Tiger0839"

    vcsRoot(Tiger0839_cVCSroot)

    buildType(Tiger0839_Hi0)
    buildType(Tiger0839_Hi2)
    buildType(Tiger0839_Hi1)
    buildType(Tiger0839_Hi3)
})

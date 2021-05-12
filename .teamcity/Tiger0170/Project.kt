package Tiger0170

import Tiger0170.buildTypes.*
import Tiger0170.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0170")
    name = "Tiger0170"

    vcsRoot(Tiger0170_cVCSroot)

    buildType(Tiger0170_Hi3)
    buildType(Tiger0170_Hi1)
    buildType(Tiger0170_Hi2)
    buildType(Tiger0170_Hi0)
})

package Tiger0540

import Tiger0540.buildTypes.*
import Tiger0540.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0540")
    name = "Tiger0540"

    vcsRoot(Tiger0540_cVCSroot)

    buildType(Tiger0540_Hi1)
    buildType(Tiger0540_Hi0)
    buildType(Tiger0540_Hi3)
    buildType(Tiger0540_Hi2)
})

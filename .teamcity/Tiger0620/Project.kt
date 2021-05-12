package Tiger0620

import Tiger0620.buildTypes.*
import Tiger0620.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0620")
    name = "Tiger0620"

    vcsRoot(Tiger0620_cVCSroot)

    buildType(Tiger0620_Hi2)
    buildType(Tiger0620_Hi1)
    buildType(Tiger0620_Hi3)
    buildType(Tiger0620_Hi0)
})

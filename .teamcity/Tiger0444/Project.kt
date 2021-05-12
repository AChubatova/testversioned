package Tiger0444

import Tiger0444.buildTypes.*
import Tiger0444.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0444")
    name = "Tiger0444"

    vcsRoot(Tiger0444_cVCSroot)

    buildType(Tiger0444_Hi0)
    buildType(Tiger0444_Hi3)
    buildType(Tiger0444_Hi2)
    buildType(Tiger0444_Hi1)
})

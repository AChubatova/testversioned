package Tiger0040

import Tiger0040.buildTypes.*
import Tiger0040.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0040")
    name = "Tiger0040"

    vcsRoot(Tiger0040_cVCSroot)

    buildType(Tiger0040_Hi0)
    buildType(Tiger0040_Hi3)
    buildType(Tiger0040_Hi1)
    buildType(Tiger0040_Hi2)
})

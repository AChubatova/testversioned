package Tiger0711

import Tiger0711.buildTypes.*
import Tiger0711.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0711")
    name = "Tiger0711"

    vcsRoot(Tiger0711_cVCSroot)

    buildType(Tiger0711_Hi3)
    buildType(Tiger0711_Hi2)
    buildType(Tiger0711_Hi1)
    buildType(Tiger0711_Hi0)
})

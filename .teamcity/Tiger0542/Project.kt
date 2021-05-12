package Tiger0542

import Tiger0542.buildTypes.*
import Tiger0542.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0542")
    name = "Tiger0542"

    vcsRoot(Tiger0542_cVCSroot)

    buildType(Tiger0542_Hi3)
    buildType(Tiger0542_Hi2)
    buildType(Tiger0542_Hi1)
    buildType(Tiger0542_Hi0)
})

package Tiger0242

import Tiger0242.buildTypes.*
import Tiger0242.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0242")
    name = "Tiger0242"

    vcsRoot(Tiger0242_cVCSroot)

    buildType(Tiger0242_Hi0)
    buildType(Tiger0242_Hi3)
    buildType(Tiger0242_Hi1)
    buildType(Tiger0242_Hi2)
})

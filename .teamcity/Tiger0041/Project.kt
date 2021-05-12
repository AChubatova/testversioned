package Tiger0041

import Tiger0041.buildTypes.*
import Tiger0041.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0041")
    name = "Tiger0041"

    vcsRoot(Tiger0041_cVCSroot)

    buildType(Tiger0041_Hi0)
    buildType(Tiger0041_Hi1)
    buildType(Tiger0041_Hi2)
    buildType(Tiger0041_Hi3)
})

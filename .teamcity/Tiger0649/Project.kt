package Tiger0649

import Tiger0649.buildTypes.*
import Tiger0649.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0649")
    name = "Tiger0649"

    vcsRoot(Tiger0649_cVCSroot)

    buildType(Tiger0649_Hi2)
    buildType(Tiger0649_Hi3)
    buildType(Tiger0649_Hi0)
    buildType(Tiger0649_Hi1)
})

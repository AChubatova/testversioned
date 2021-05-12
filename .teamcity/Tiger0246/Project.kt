package Tiger0246

import Tiger0246.buildTypes.*
import Tiger0246.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0246")
    name = "Tiger0246"

    vcsRoot(Tiger0246_cVCSroot)

    buildType(Tiger0246_Hi0)
    buildType(Tiger0246_Hi3)
    buildType(Tiger0246_Hi2)
    buildType(Tiger0246_Hi1)
})

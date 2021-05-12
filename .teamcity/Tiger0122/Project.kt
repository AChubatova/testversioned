package Tiger0122

import Tiger0122.buildTypes.*
import Tiger0122.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0122")
    name = "Tiger0122"

    vcsRoot(Tiger0122_cVCSroot)

    buildType(Tiger0122_Hi2)
    buildType(Tiger0122_Hi3)
    buildType(Tiger0122_Hi0)
    buildType(Tiger0122_Hi1)
})

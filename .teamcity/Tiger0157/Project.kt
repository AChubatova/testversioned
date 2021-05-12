package Tiger0157

import Tiger0157.buildTypes.*
import Tiger0157.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0157")
    name = "Tiger0157"

    vcsRoot(Tiger0157_cVCSroot)

    buildType(Tiger0157_Hi3)
    buildType(Tiger0157_Hi2)
    buildType(Tiger0157_Hi1)
    buildType(Tiger0157_Hi0)
})

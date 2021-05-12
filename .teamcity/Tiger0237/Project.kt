package Tiger0237

import Tiger0237.buildTypes.*
import Tiger0237.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0237")
    name = "Tiger0237"

    vcsRoot(Tiger0237_cVCSroot)

    buildType(Tiger0237_Hi3)
    buildType(Tiger0237_Hi0)
    buildType(Tiger0237_Hi1)
    buildType(Tiger0237_Hi2)
})

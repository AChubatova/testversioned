package Tiger0927

import Tiger0927.buildTypes.*
import Tiger0927.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0927")
    name = "Tiger0927"

    vcsRoot(Tiger0927_cVCSroot)

    buildType(Tiger0927_Hi3)
    buildType(Tiger0927_Hi2)
    buildType(Tiger0927_Hi1)
    buildType(Tiger0927_Hi0)
})

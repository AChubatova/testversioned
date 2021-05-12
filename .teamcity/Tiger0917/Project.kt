package Tiger0917

import Tiger0917.buildTypes.*
import Tiger0917.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0917")
    name = "Tiger0917"

    vcsRoot(Tiger0917_cVCSroot)

    buildType(Tiger0917_Hi0)
    buildType(Tiger0917_Hi1)
    buildType(Tiger0917_Hi2)
    buildType(Tiger0917_Hi3)
})

package Tiger0628

import Tiger0628.buildTypes.*
import Tiger0628.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0628")
    name = "Tiger0628"

    vcsRoot(Tiger0628_cVCSroot)

    buildType(Tiger0628_Hi3)
    buildType(Tiger0628_Hi1)
    buildType(Tiger0628_Hi2)
    buildType(Tiger0628_Hi0)
})

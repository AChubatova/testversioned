package Tiger0822

import Tiger0822.buildTypes.*
import Tiger0822.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0822")
    name = "Tiger0822"

    vcsRoot(Tiger0822_cVCSroot)

    buildType(Tiger0822_Hi0)
    buildType(Tiger0822_Hi3)
    buildType(Tiger0822_Hi1)
    buildType(Tiger0822_Hi2)
})

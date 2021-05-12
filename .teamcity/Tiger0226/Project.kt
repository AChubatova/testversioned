package Tiger0226

import Tiger0226.buildTypes.*
import Tiger0226.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0226")
    name = "Tiger0226"

    vcsRoot(Tiger0226_cVCSroot)

    buildType(Tiger0226_Hi3)
    buildType(Tiger0226_Hi0)
    buildType(Tiger0226_Hi2)
    buildType(Tiger0226_Hi1)
})

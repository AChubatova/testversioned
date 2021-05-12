package Tiger094

import Tiger094.buildTypes.*
import Tiger094.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger094")
    name = "Tiger094"

    vcsRoot(Tiger094_cVCSroot)

    buildType(Tiger094_Hi2)
    buildType(Tiger094_Hi3)
    buildType(Tiger094_Hi0)
    buildType(Tiger094_Hi1)
})

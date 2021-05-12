package Tiger01225

import Tiger01225.buildTypes.*
import Tiger01225.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01225")
    name = "Tiger01225"

    vcsRoot(Tiger01225_cVCSroot)

    buildType(Tiger01225_Hi3)
    buildType(Tiger01225_Hi2)
    buildType(Tiger01225_Hi1)
    buildType(Tiger01225_Hi0)
})

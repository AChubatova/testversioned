package Tiger093

import Tiger093.buildTypes.*
import Tiger093.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger093")
    name = "Tiger093"

    vcsRoot(Tiger093_cVCSroot)

    buildType(Tiger093_Hi1)
    buildType(Tiger093_Hi2)
    buildType(Tiger093_Hi3)
    buildType(Tiger093_Hi0)
})

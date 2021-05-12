package Tiger079

import Tiger079.buildTypes.*
import Tiger079.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger079")
    name = "Tiger079"

    vcsRoot(Tiger079_cVCSroot)

    buildType(Tiger079_Hi3)
    buildType(Tiger079_Hi2)
    buildType(Tiger079_Hi1)
    buildType(Tiger079_Hi0)
})

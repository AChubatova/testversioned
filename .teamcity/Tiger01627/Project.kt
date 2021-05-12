package Tiger01627

import Tiger01627.buildTypes.*
import Tiger01627.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01627")
    name = "Tiger01627"

    vcsRoot(Tiger01627_cVCSroot)

    buildType(Tiger01627_Hi0)
    buildType(Tiger01627_Hi1)
    buildType(Tiger01627_Hi2)
    buildType(Tiger01627_Hi3)
})

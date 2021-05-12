package Tiger01922

import Tiger01922.buildTypes.*
import Tiger01922.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01922")
    name = "Tiger01922"

    vcsRoot(Tiger01922_cVCSroot)

    buildType(Tiger01922_Hi3)
    buildType(Tiger01922_Hi0)
    buildType(Tiger01922_Hi2)
    buildType(Tiger01922_Hi1)
})

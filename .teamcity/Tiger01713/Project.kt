package Tiger01713

import Tiger01713.buildTypes.*
import Tiger01713.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01713")
    name = "Tiger01713"

    vcsRoot(Tiger01713_cVCSroot)

    buildType(Tiger01713_Hi0)
    buildType(Tiger01713_Hi2)
    buildType(Tiger01713_Hi1)
    buildType(Tiger01713_Hi3)
})

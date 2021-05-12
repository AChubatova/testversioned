package Tiger01415

import Tiger01415.buildTypes.*
import Tiger01415.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01415")
    name = "Tiger01415"

    vcsRoot(Tiger01415_cVCSroot)

    buildType(Tiger01415_Hi3)
    buildType(Tiger01415_Hi2)
    buildType(Tiger01415_Hi1)
    buildType(Tiger01415_Hi0)
})

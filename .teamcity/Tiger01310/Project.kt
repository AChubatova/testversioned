package Tiger01310

import Tiger01310.buildTypes.*
import Tiger01310.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01310")
    name = "Tiger01310"

    vcsRoot(Tiger01310_cVCSroot)

    buildType(Tiger01310_Hi2)
    buildType(Tiger01310_Hi3)
    buildType(Tiger01310_Hi0)
    buildType(Tiger01310_Hi1)
})

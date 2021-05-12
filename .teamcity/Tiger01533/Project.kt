package Tiger01533

import Tiger01533.buildTypes.*
import Tiger01533.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01533")
    name = "Tiger01533"

    vcsRoot(Tiger01533_cVCSroot)

    buildType(Tiger01533_Hi2)
    buildType(Tiger01533_Hi1)
    buildType(Tiger01533_Hi0)
    buildType(Tiger01533_Hi3)
})

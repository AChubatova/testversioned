package Tiger01042

import Tiger01042.buildTypes.*
import Tiger01042.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01042")
    name = "Tiger01042"

    vcsRoot(Tiger01042_cVCSroot)

    buildType(Tiger01042_Hi0)
    buildType(Tiger01042_Hi1)
    buildType(Tiger01042_Hi2)
    buildType(Tiger01042_Hi3)
})

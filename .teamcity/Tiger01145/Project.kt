package Tiger01145

import Tiger01145.buildTypes.*
import Tiger01145.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01145")
    name = "Tiger01145"

    vcsRoot(Tiger01145_cVCSroot)

    buildType(Tiger01145_Hi3)
    buildType(Tiger01145_Hi2)
    buildType(Tiger01145_Hi1)
    buildType(Tiger01145_Hi0)
})

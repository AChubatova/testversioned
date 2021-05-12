package Tiger01543

import Tiger01543.buildTypes.*
import Tiger01543.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01543")
    name = "Tiger01543"

    vcsRoot(Tiger01543_cVCSroot)

    buildType(Tiger01543_Hi3)
    buildType(Tiger01543_Hi2)
    buildType(Tiger01543_Hi1)
    buildType(Tiger01543_Hi0)
})

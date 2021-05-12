package Tiger01429

import Tiger01429.buildTypes.*
import Tiger01429.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01429")
    name = "Tiger01429"

    vcsRoot(Tiger01429_cVCSroot)

    buildType(Tiger01429_Hi0)
    buildType(Tiger01429_Hi1)
    buildType(Tiger01429_Hi2)
    buildType(Tiger01429_Hi3)
})

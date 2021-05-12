package Tiger01919

import Tiger01919.buildTypes.*
import Tiger01919.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01919")
    name = "Tiger01919"

    vcsRoot(Tiger01919_cVCSroot)

    buildType(Tiger01919_Hi1)
    buildType(Tiger01919_Hi2)
    buildType(Tiger01919_Hi0)
    buildType(Tiger01919_Hi3)
})

package Tiger01131

import Tiger01131.buildTypes.*
import Tiger01131.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01131")
    name = "Tiger01131"

    vcsRoot(Tiger01131_cVCSroot)

    buildType(Tiger01131_Hi2)
    buildType(Tiger01131_Hi1)
    buildType(Tiger01131_Hi3)
    buildType(Tiger01131_Hi0)
})

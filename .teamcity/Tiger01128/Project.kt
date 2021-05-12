package Tiger01128

import Tiger01128.buildTypes.*
import Tiger01128.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01128")
    name = "Tiger01128"

    vcsRoot(Tiger01128_cVCSroot)

    buildType(Tiger01128_Hi3)
    buildType(Tiger01128_Hi2)
    buildType(Tiger01128_Hi1)
    buildType(Tiger01128_Hi0)
})

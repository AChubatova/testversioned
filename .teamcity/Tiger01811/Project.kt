package Tiger01811

import Tiger01811.buildTypes.*
import Tiger01811.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01811")
    name = "Tiger01811"

    vcsRoot(Tiger01811_cVCSroot)

    buildType(Tiger01811_Hi3)
    buildType(Tiger01811_Hi2)
    buildType(Tiger01811_Hi1)
    buildType(Tiger01811_Hi0)
})

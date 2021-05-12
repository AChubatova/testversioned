package Tiger01243

import Tiger01243.buildTypes.*
import Tiger01243.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01243")
    name = "Tiger01243"

    vcsRoot(Tiger01243_cVCSroot)

    buildType(Tiger01243_Hi0)
    buildType(Tiger01243_Hi2)
    buildType(Tiger01243_Hi1)
    buildType(Tiger01243_Hi3)
})

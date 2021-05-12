package Tiger01914

import Tiger01914.buildTypes.*
import Tiger01914.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01914")
    name = "Tiger01914"

    vcsRoot(Tiger01914_cVCSroot)

    buildType(Tiger01914_Hi0)
    buildType(Tiger01914_Hi1)
    buildType(Tiger01914_Hi2)
    buildType(Tiger01914_Hi3)
})

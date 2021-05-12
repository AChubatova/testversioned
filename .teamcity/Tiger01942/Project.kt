package Tiger01942

import Tiger01942.buildTypes.*
import Tiger01942.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01942")
    name = "Tiger01942"

    vcsRoot(Tiger01942_cVCSroot)

    buildType(Tiger01942_Hi0)
    buildType(Tiger01942_Hi3)
    buildType(Tiger01942_Hi1)
    buildType(Tiger01942_Hi2)
})

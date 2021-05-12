package Tiger01235

import Tiger01235.buildTypes.*
import Tiger01235.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01235")
    name = "Tiger01235"

    vcsRoot(Tiger01235_cVCSroot)

    buildType(Tiger01235_Hi0)
    buildType(Tiger01235_Hi1)
    buildType(Tiger01235_Hi2)
    buildType(Tiger01235_Hi3)
})

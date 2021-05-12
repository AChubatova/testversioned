package Tiger01722

import Tiger01722.buildTypes.*
import Tiger01722.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01722")
    name = "Tiger01722"

    vcsRoot(Tiger01722_cVCSroot)

    buildType(Tiger01722_Hi0)
    buildType(Tiger01722_Hi1)
    buildType(Tiger01722_Hi2)
    buildType(Tiger01722_Hi3)
})

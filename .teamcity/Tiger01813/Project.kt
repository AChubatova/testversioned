package Tiger01813

import Tiger01813.buildTypes.*
import Tiger01813.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01813")
    name = "Tiger01813"

    vcsRoot(Tiger01813_cVCSroot)

    buildType(Tiger01813_Hi0)
    buildType(Tiger01813_Hi1)
    buildType(Tiger01813_Hi2)
    buildType(Tiger01813_Hi3)
})

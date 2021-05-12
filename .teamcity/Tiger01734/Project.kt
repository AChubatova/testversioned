package Tiger01734

import Tiger01734.buildTypes.*
import Tiger01734.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01734")
    name = "Tiger01734"

    vcsRoot(Tiger01734_cVCSroot)

    buildType(Tiger01734_Hi1)
    buildType(Tiger01734_Hi0)
    buildType(Tiger01734_Hi3)
    buildType(Tiger01734_Hi2)
})

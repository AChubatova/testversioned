package Tiger01216

import Tiger01216.buildTypes.*
import Tiger01216.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01216")
    name = "Tiger01216"

    vcsRoot(Tiger01216_cVCSroot)

    buildType(Tiger01216_Hi0)
    buildType(Tiger01216_Hi1)
    buildType(Tiger01216_Hi2)
    buildType(Tiger01216_Hi3)
})

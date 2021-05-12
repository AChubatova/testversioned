package Tiger01529

import Tiger01529.buildTypes.*
import Tiger01529.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01529")
    name = "Tiger01529"

    vcsRoot(Tiger01529_cVCSroot)

    buildType(Tiger01529_Hi2)
    buildType(Tiger01529_Hi3)
    buildType(Tiger01529_Hi0)
    buildType(Tiger01529_Hi1)
})

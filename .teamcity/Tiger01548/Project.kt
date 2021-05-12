package Tiger01548

import Tiger01548.buildTypes.*
import Tiger01548.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01548")
    name = "Tiger01548"

    vcsRoot(Tiger01548_cVCSroot)

    buildType(Tiger01548_Hi1)
    buildType(Tiger01548_Hi2)
    buildType(Tiger01548_Hi0)
    buildType(Tiger01548_Hi3)
})

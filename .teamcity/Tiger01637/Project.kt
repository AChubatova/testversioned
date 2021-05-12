package Tiger01637

import Tiger01637.buildTypes.*
import Tiger01637.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01637")
    name = "Tiger01637"

    vcsRoot(Tiger01637_cVCSroot)

    buildType(Tiger01637_Hi3)
    buildType(Tiger01637_Hi2)
    buildType(Tiger01637_Hi1)
    buildType(Tiger01637_Hi0)
})

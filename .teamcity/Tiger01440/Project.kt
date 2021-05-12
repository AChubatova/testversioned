package Tiger01440

import Tiger01440.buildTypes.*
import Tiger01440.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01440")
    name = "Tiger01440"

    vcsRoot(Tiger01440_cVCSroot)

    buildType(Tiger01440_Hi3)
    buildType(Tiger01440_Hi2)
    buildType(Tiger01440_Hi1)
    buildType(Tiger01440_Hi0)
})

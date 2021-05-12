package Tiger01747

import Tiger01747.buildTypes.*
import Tiger01747.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01747")
    name = "Tiger01747"

    vcsRoot(Tiger01747_cVCSroot)

    buildType(Tiger01747_Hi0)
    buildType(Tiger01747_Hi1)
    buildType(Tiger01747_Hi2)
    buildType(Tiger01747_Hi3)
})

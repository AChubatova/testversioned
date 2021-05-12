package Tiger01612

import Tiger01612.buildTypes.*
import Tiger01612.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01612")
    name = "Tiger01612"

    vcsRoot(Tiger01612_cVCSroot)

    buildType(Tiger01612_Hi0)
    buildType(Tiger01612_Hi2)
    buildType(Tiger01612_Hi1)
    buildType(Tiger01612_Hi3)
})

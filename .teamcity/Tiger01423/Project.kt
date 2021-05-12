package Tiger01423

import Tiger01423.buildTypes.*
import Tiger01423.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01423")
    name = "Tiger01423"

    vcsRoot(Tiger01423_cVCSroot)

    buildType(Tiger01423_Hi3)
    buildType(Tiger01423_Hi2)
    buildType(Tiger01423_Hi1)
    buildType(Tiger01423_Hi0)
})

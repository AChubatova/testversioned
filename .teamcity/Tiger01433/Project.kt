package Tiger01433

import Tiger01433.buildTypes.*
import Tiger01433.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01433")
    name = "Tiger01433"

    vcsRoot(Tiger01433_cVCSroot)

    buildType(Tiger01433_Hi0)
    buildType(Tiger01433_Hi1)
    buildType(Tiger01433_Hi2)
    buildType(Tiger01433_Hi3)
})

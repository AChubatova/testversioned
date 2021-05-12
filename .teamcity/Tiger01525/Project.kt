package Tiger01525

import Tiger01525.buildTypes.*
import Tiger01525.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01525")
    name = "Tiger01525"

    vcsRoot(Tiger01525_cVCSroot)

    buildType(Tiger01525_Hi2)
    buildType(Tiger01525_Hi3)
    buildType(Tiger01525_Hi0)
    buildType(Tiger01525_Hi1)
})

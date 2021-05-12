package Tiger01617

import Tiger01617.buildTypes.*
import Tiger01617.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01617")
    name = "Tiger01617"

    vcsRoot(Tiger01617_cVCSroot)

    buildType(Tiger01617_Hi3)
    buildType(Tiger01617_Hi2)
    buildType(Tiger01617_Hi1)
    buildType(Tiger01617_Hi0)
})

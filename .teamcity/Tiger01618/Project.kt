package Tiger01618

import Tiger01618.buildTypes.*
import Tiger01618.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01618")
    name = "Tiger01618"

    vcsRoot(Tiger01618_cVCSroot)

    buildType(Tiger01618_Hi1)
    buildType(Tiger01618_Hi2)
    buildType(Tiger01618_Hi0)
    buildType(Tiger01618_Hi3)
})

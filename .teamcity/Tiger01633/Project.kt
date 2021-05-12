package Tiger01633

import Tiger01633.buildTypes.*
import Tiger01633.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01633")
    name = "Tiger01633"

    vcsRoot(Tiger01633_cVCSroot)

    buildType(Tiger01633_Hi3)
    buildType(Tiger01633_Hi2)
    buildType(Tiger01633_Hi1)
    buildType(Tiger01633_Hi0)
})

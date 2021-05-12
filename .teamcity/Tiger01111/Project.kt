package Tiger01111

import Tiger01111.buildTypes.*
import Tiger01111.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01111")
    name = "Tiger01111"

    vcsRoot(Tiger01111_cVCSroot)

    buildType(Tiger01111_Hi0)
    buildType(Tiger01111_Hi1)
    buildType(Tiger01111_Hi2)
    buildType(Tiger01111_Hi3)
})

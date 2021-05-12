package Tiger01112

import Tiger01112.buildTypes.*
import Tiger01112.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01112")
    name = "Tiger01112"

    vcsRoot(Tiger01112_cVCSroot)

    buildType(Tiger01112_Hi2)
    buildType(Tiger01112_Hi3)
    buildType(Tiger01112_Hi0)
    buildType(Tiger01112_Hi1)
})

package Tiger01648

import Tiger01648.buildTypes.*
import Tiger01648.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01648")
    name = "Tiger01648"

    vcsRoot(Tiger01648_cVCSroot)

    buildType(Tiger01648_Hi0)
    buildType(Tiger01648_Hi1)
    buildType(Tiger01648_Hi2)
    buildType(Tiger01648_Hi3)
})

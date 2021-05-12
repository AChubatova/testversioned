package Tiger01712

import Tiger01712.buildTypes.*
import Tiger01712.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01712")
    name = "Tiger01712"

    vcsRoot(Tiger01712_cVCSroot)

    buildType(Tiger01712_Hi3)
    buildType(Tiger01712_Hi2)
    buildType(Tiger01712_Hi1)
    buildType(Tiger01712_Hi0)
})

package Tiger01544

import Tiger01544.buildTypes.*
import Tiger01544.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01544")
    name = "Tiger01544"

    vcsRoot(Tiger01544_cVCSroot)

    buildType(Tiger01544_Hi3)
    buildType(Tiger01544_Hi0)
    buildType(Tiger01544_Hi2)
    buildType(Tiger01544_Hi1)
})

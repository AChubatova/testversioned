package Tiger01130

import Tiger01130.buildTypes.*
import Tiger01130.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01130")
    name = "Tiger01130"

    vcsRoot(Tiger01130_cVCSroot)

    buildType(Tiger01130_Hi3)
    buildType(Tiger01130_Hi2)
    buildType(Tiger01130_Hi1)
    buildType(Tiger01130_Hi0)
})

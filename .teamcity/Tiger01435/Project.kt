package Tiger01435

import Tiger01435.buildTypes.*
import Tiger01435.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01435")
    name = "Tiger01435"

    vcsRoot(Tiger01435_cVCSroot)

    buildType(Tiger01435_Hi3)
    buildType(Tiger01435_Hi2)
    buildType(Tiger01435_Hi1)
    buildType(Tiger01435_Hi0)
})

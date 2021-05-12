package Tiger01620

import Tiger01620.buildTypes.*
import Tiger01620.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01620")
    name = "Tiger01620"

    vcsRoot(Tiger01620_cVCSroot)

    buildType(Tiger01620_Hi2)
    buildType(Tiger01620_Hi3)
    buildType(Tiger01620_Hi0)
    buildType(Tiger01620_Hi1)
})

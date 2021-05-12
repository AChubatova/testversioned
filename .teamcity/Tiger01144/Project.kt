package Tiger01144

import Tiger01144.buildTypes.*
import Tiger01144.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01144")
    name = "Tiger01144"

    vcsRoot(Tiger01144_cVCSroot)

    buildType(Tiger01144_Hi0)
    buildType(Tiger01144_Hi2)
    buildType(Tiger01144_Hi1)
    buildType(Tiger01144_Hi3)
})

package Tiger01849

import Tiger01849.buildTypes.*
import Tiger01849.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01849")
    name = "Tiger01849"

    vcsRoot(Tiger01849_cVCSroot)

    buildType(Tiger01849_Hi3)
    buildType(Tiger01849_Hi2)
    buildType(Tiger01849_Hi1)
    buildType(Tiger01849_Hi0)
})

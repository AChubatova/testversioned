package Tiger01339

import Tiger01339.buildTypes.*
import Tiger01339.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01339")
    name = "Tiger01339"

    vcsRoot(Tiger01339_cVCSroot)

    buildType(Tiger01339_Hi3)
    buildType(Tiger01339_Hi2)
    buildType(Tiger01339_Hi1)
    buildType(Tiger01339_Hi0)
})

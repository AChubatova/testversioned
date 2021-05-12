package Tiger01619

import Tiger01619.buildTypes.*
import Tiger01619.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01619")
    name = "Tiger01619"

    vcsRoot(Tiger01619_cVCSroot)

    buildType(Tiger01619_Hi0)
    buildType(Tiger01619_Hi1)
    buildType(Tiger01619_Hi2)
    buildType(Tiger01619_Hi3)
})

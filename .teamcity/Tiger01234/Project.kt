package Tiger01234

import Tiger01234.buildTypes.*
import Tiger01234.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01234")
    name = "Tiger01234"

    vcsRoot(Tiger01234_cVCSroot)

    buildType(Tiger01234_Hi0)
    buildType(Tiger01234_Hi3)
    buildType(Tiger01234_Hi1)
    buildType(Tiger01234_Hi2)
})

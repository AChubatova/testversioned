package Tiger01414

import Tiger01414.buildTypes.*
import Tiger01414.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01414")
    name = "Tiger01414"

    vcsRoot(Tiger01414_cVCSroot)

    buildType(Tiger01414_Hi0)
    buildType(Tiger01414_Hi2)
    buildType(Tiger01414_Hi1)
    buildType(Tiger01414_Hi3)
})

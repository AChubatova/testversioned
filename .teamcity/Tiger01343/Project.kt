package Tiger01343

import Tiger01343.buildTypes.*
import Tiger01343.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01343")
    name = "Tiger01343"

    vcsRoot(Tiger01343_cVCSroot)

    buildType(Tiger01343_Hi3)
    buildType(Tiger01343_Hi2)
    buildType(Tiger01343_Hi1)
    buildType(Tiger01343_Hi0)
})

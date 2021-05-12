package Tiger01716

import Tiger01716.buildTypes.*
import Tiger01716.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01716")
    name = "Tiger01716"

    vcsRoot(Tiger01716_cVCSroot)

    buildType(Tiger01716_Hi0)
    buildType(Tiger01716_Hi1)
    buildType(Tiger01716_Hi2)
    buildType(Tiger01716_Hi3)
})

package Tiger057

import Tiger057.buildTypes.*
import Tiger057.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger057")
    name = "Tiger057"

    vcsRoot(Tiger057_cVCSroot)

    buildType(Tiger057_Hi0)
    buildType(Tiger057_Hi2)
    buildType(Tiger057_Hi1)
    buildType(Tiger057_Hi3)
})

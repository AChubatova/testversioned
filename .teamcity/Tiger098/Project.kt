package Tiger098

import Tiger098.buildTypes.*
import Tiger098.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger098")
    name = "Tiger098"

    vcsRoot(Tiger098_cVCSroot)

    buildType(Tiger098_Hi2)
    buildType(Tiger098_Hi3)
    buildType(Tiger098_Hi0)
    buildType(Tiger098_Hi1)
})

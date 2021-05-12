package Tiger01318

import Tiger01318.buildTypes.*
import Tiger01318.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01318")
    name = "Tiger01318"

    vcsRoot(Tiger01318_cVCSroot)

    buildType(Tiger01318_Hi3)
    buildType(Tiger01318_Hi2)
    buildType(Tiger01318_Hi1)
    buildType(Tiger01318_Hi0)
})

package Tiger060

import Tiger060.buildTypes.*
import Tiger060.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger060")
    name = "Tiger060"

    vcsRoot(Tiger060_cVCSroot)

    buildType(Tiger060_Hi0)
    buildType(Tiger060_Hi3)
    buildType(Tiger060_Hi2)
    buildType(Tiger060_Hi1)
})

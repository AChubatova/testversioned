package Tiger054

import Tiger054.buildTypes.*
import Tiger054.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger054")
    name = "Tiger054"

    vcsRoot(Tiger054_cVCSroot)

    buildType(Tiger054_Hi2)
    buildType(Tiger054_Hi3)
    buildType(Tiger054_Hi0)
    buildType(Tiger054_Hi1)
})

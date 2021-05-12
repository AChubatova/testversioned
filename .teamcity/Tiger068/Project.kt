package Tiger068

import Tiger068.buildTypes.*
import Tiger068.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger068")
    name = "Tiger068"

    vcsRoot(Tiger068_cVCSroot)

    buildType(Tiger068_Hi1)
    buildType(Tiger068_Hi2)
    buildType(Tiger068_Hi3)
    buildType(Tiger068_Hi0)
})

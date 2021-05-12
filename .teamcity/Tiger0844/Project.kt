package Tiger0844

import Tiger0844.buildTypes.*
import Tiger0844.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0844")
    name = "Tiger0844"

    vcsRoot(Tiger0844_cVCSroot)

    buildType(Tiger0844_Hi1)
    buildType(Tiger0844_Hi2)
    buildType(Tiger0844_Hi3)
    buildType(Tiger0844_Hi0)
})

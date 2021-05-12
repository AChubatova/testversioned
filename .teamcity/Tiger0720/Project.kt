package Tiger0720

import Tiger0720.buildTypes.*
import Tiger0720.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0720")
    name = "Tiger0720"

    vcsRoot(Tiger0720_cVCSroot)

    buildType(Tiger0720_Hi0)
    buildType(Tiger0720_Hi1)
    buildType(Tiger0720_Hi2)
    buildType(Tiger0720_Hi3)
})

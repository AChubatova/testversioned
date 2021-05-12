package Tiger0198

import Tiger0198.buildTypes.*
import Tiger0198.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0198")
    name = "Tiger0198"

    vcsRoot(Tiger0198_cVCSroot)

    buildType(Tiger0198_Hi2)
    buildType(Tiger0198_Hi1)
    buildType(Tiger0198_Hi3)
    buildType(Tiger0198_Hi0)
})

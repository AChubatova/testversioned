package Tiger0916

import Tiger0916.buildTypes.*
import Tiger0916.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0916")
    name = "Tiger0916"

    vcsRoot(Tiger0916_cVCSroot)

    buildType(Tiger0916_Hi3)
    buildType(Tiger0916_Hi0)
    buildType(Tiger0916_Hi1)
    buildType(Tiger0916_Hi2)
})

package Tiger0718

import Tiger0718.buildTypes.*
import Tiger0718.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0718")
    name = "Tiger0718"

    vcsRoot(Tiger0718_cVCSroot)

    buildType(Tiger0718_Hi2)
    buildType(Tiger0718_Hi1)
    buildType(Tiger0718_Hi0)
    buildType(Tiger0718_Hi3)
})

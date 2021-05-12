package Tiger0243

import Tiger0243.buildTypes.*
import Tiger0243.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0243")
    name = "Tiger0243"

    vcsRoot(Tiger0243_cVCSroot)

    buildType(Tiger0243_Hi0)
    buildType(Tiger0243_Hi1)
    buildType(Tiger0243_Hi2)
    buildType(Tiger0243_Hi3)
})

package Tiger0124

import Tiger0124.buildTypes.*
import Tiger0124.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0124")
    name = "Tiger0124"

    vcsRoot(Tiger0124_cVCSroot)

    buildType(Tiger0124_Hi3)
    buildType(Tiger0124_Hi2)
    buildType(Tiger0124_Hi1)
    buildType(Tiger0124_Hi0)
})

package Tiger0646

import Tiger0646.buildTypes.*
import Tiger0646.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0646")
    name = "Tiger0646"

    vcsRoot(Tiger0646_cVCSroot)

    buildType(Tiger0646_Hi1)
    buildType(Tiger0646_Hi2)
    buildType(Tiger0646_Hi3)
    buildType(Tiger0646_Hi0)
})

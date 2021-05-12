package Tiger0120

import Tiger0120.buildTypes.*
import Tiger0120.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0120")
    name = "Tiger0120"

    vcsRoot(Tiger0120_cVCSroot)

    buildType(Tiger0120_Hi0)
    buildType(Tiger0120_Hi1)
    buildType(Tiger0120_Hi2)
    buildType(Tiger0120_Hi3)
})

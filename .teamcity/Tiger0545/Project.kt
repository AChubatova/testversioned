package Tiger0545

import Tiger0545.buildTypes.*
import Tiger0545.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0545")
    name = "Tiger0545"

    vcsRoot(Tiger0545_cVCSroot)

    buildType(Tiger0545_Hi2)
    buildType(Tiger0545_Hi1)
    buildType(Tiger0545_Hi0)
    buildType(Tiger0545_Hi3)
})

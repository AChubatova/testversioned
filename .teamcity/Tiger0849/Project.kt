package Tiger0849

import Tiger0849.buildTypes.*
import Tiger0849.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0849")
    name = "Tiger0849"

    vcsRoot(Tiger0849_cVCSroot)

    buildType(Tiger0849_Hi2)
    buildType(Tiger0849_Hi3)
    buildType(Tiger0849_Hi0)
    buildType(Tiger0849_Hi1)
})

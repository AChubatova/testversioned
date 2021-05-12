package Tiger0539

import Tiger0539.buildTypes.*
import Tiger0539.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0539")
    name = "Tiger0539"

    vcsRoot(Tiger0539_cVCSroot)

    buildType(Tiger0539_Hi1)
    buildType(Tiger0539_Hi0)
    buildType(Tiger0539_Hi3)
    buildType(Tiger0539_Hi2)
})

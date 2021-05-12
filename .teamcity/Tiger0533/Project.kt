package Tiger0533

import Tiger0533.buildTypes.*
import Tiger0533.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0533")
    name = "Tiger0533"

    vcsRoot(Tiger0533_cVCSroot)

    buildType(Tiger0533_Hi2)
    buildType(Tiger0533_Hi3)
    buildType(Tiger0533_Hi0)
    buildType(Tiger0533_Hi1)
})

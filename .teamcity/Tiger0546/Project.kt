package Tiger0546

import Tiger0546.buildTypes.*
import Tiger0546.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0546")
    name = "Tiger0546"

    vcsRoot(Tiger0546_cVCSroot)

    buildType(Tiger0546_Hi1)
    buildType(Tiger0546_Hi0)
    buildType(Tiger0546_Hi3)
    buildType(Tiger0546_Hi2)
})

package Tiger0935

import Tiger0935.buildTypes.*
import Tiger0935.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0935")
    name = "Tiger0935"

    vcsRoot(Tiger0935_cVCSroot)

    buildType(Tiger0935_Hi1)
    buildType(Tiger0935_Hi0)
    buildType(Tiger0935_Hi3)
    buildType(Tiger0935_Hi2)
})

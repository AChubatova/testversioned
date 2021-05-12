package Tiger0632

import Tiger0632.buildTypes.*
import Tiger0632.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0632")
    name = "Tiger0632"

    vcsRoot(Tiger0632_cVCSroot)

    buildType(Tiger0632_Hi2)
    buildType(Tiger0632_Hi3)
    buildType(Tiger0632_Hi0)
    buildType(Tiger0632_Hi1)
})

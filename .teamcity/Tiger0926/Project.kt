package Tiger0926

import Tiger0926.buildTypes.*
import Tiger0926.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0926")
    name = "Tiger0926"

    vcsRoot(Tiger0926_cVCSroot)

    buildType(Tiger0926_Hi1)
    buildType(Tiger0926_Hi0)
    buildType(Tiger0926_Hi3)
    buildType(Tiger0926_Hi2)
})

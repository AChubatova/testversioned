package Tiger0549

import Tiger0549.buildTypes.*
import Tiger0549.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0549")
    name = "Tiger0549"

    vcsRoot(Tiger0549_cVCSroot)

    buildType(Tiger0549_Hi0)
    buildType(Tiger0549_Hi1)
    buildType(Tiger0549_Hi2)
    buildType(Tiger0549_Hi3)
})

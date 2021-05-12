package Tiger0823

import Tiger0823.buildTypes.*
import Tiger0823.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0823")
    name = "Tiger0823"

    vcsRoot(Tiger0823_cVCSroot)

    buildType(Tiger0823_Hi0)
    buildType(Tiger0823_Hi1)
    buildType(Tiger0823_Hi2)
    buildType(Tiger0823_Hi3)
})

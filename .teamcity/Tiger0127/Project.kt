package Tiger0127

import Tiger0127.buildTypes.*
import Tiger0127.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0127")
    name = "Tiger0127"

    vcsRoot(Tiger0127_cVCSroot)

    buildType(Tiger0127_Hi0)
    buildType(Tiger0127_Hi2)
    buildType(Tiger0127_Hi1)
    buildType(Tiger0127_Hi3)
})

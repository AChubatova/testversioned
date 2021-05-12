package Tiger0829

import Tiger0829.buildTypes.*
import Tiger0829.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0829")
    name = "Tiger0829"

    vcsRoot(Tiger0829_cVCSroot)

    buildType(Tiger0829_Hi1)
    buildType(Tiger0829_Hi0)
    buildType(Tiger0829_Hi3)
    buildType(Tiger0829_Hi2)
})

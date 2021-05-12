package Tiger0643

import Tiger0643.buildTypes.*
import Tiger0643.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0643")
    name = "Tiger0643"

    vcsRoot(Tiger0643_cVCSroot)

    buildType(Tiger0643_Hi1)
    buildType(Tiger0643_Hi0)
    buildType(Tiger0643_Hi3)
    buildType(Tiger0643_Hi2)
})

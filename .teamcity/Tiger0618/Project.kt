package Tiger0618

import Tiger0618.buildTypes.*
import Tiger0618.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0618")
    name = "Tiger0618"

    vcsRoot(Tiger0618_cVCSroot)

    buildType(Tiger0618_Hi1)
    buildType(Tiger0618_Hi0)
    buildType(Tiger0618_Hi3)
    buildType(Tiger0618_Hi2)
})

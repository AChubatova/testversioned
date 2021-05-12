package Tiger0810

import Tiger0810.buildTypes.*
import Tiger0810.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0810")
    name = "Tiger0810"

    vcsRoot(Tiger0810_cVCSroot)

    buildType(Tiger0810_Hi1)
    buildType(Tiger0810_Hi0)
    buildType(Tiger0810_Hi3)
    buildType(Tiger0810_Hi2)
})

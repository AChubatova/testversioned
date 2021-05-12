package Tiger0152

import Tiger0152.buildTypes.*
import Tiger0152.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0152")
    name = "Tiger0152"

    vcsRoot(Tiger0152_cVCSroot)

    buildType(Tiger0152_Hi0)
    buildType(Tiger0152_Hi2)
    buildType(Tiger0152_Hi1)
    buildType(Tiger0152_Hi3)
})

package Tiger0748

import Tiger0748.buildTypes.*
import Tiger0748.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0748")
    name = "Tiger0748"

    vcsRoot(Tiger0748_cVCSroot)

    buildType(Tiger0748_Hi2)
    buildType(Tiger0748_Hi3)
    buildType(Tiger0748_Hi0)
    buildType(Tiger0748_Hi1)
})

package Tiger0639

import Tiger0639.buildTypes.*
import Tiger0639.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0639")
    name = "Tiger0639"

    vcsRoot(Tiger0639_cVCSroot)

    buildType(Tiger0639_Hi0)
    buildType(Tiger0639_Hi2)
    buildType(Tiger0639_Hi1)
    buildType(Tiger0639_Hi3)
})

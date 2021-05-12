package Tiger0334

import Tiger0334.buildTypes.*
import Tiger0334.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0334")
    name = "Tiger0334"

    vcsRoot(Tiger0334_cVCSroot)

    buildType(Tiger0334_Hi0)
    buildType(Tiger0334_Hi1)
    buildType(Tiger0334_Hi2)
    buildType(Tiger0334_Hi3)
})

package Tiger0931

import Tiger0931.buildTypes.*
import Tiger0931.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0931")
    name = "Tiger0931"

    vcsRoot(Tiger0931_cVCSroot)

    buildType(Tiger0931_Hi1)
    buildType(Tiger0931_Hi0)
    buildType(Tiger0931_Hi3)
    buildType(Tiger0931_Hi2)
})

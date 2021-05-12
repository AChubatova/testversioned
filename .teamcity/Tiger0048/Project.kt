package Tiger0048

import Tiger0048.buildTypes.*
import Tiger0048.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0048")
    name = "Tiger0048"

    vcsRoot(Tiger0048_cVCSroot)

    buildType(Tiger0048_Hi0)
    buildType(Tiger0048_Hi3)
    buildType(Tiger0048_Hi1)
    buildType(Tiger0048_Hi2)
})

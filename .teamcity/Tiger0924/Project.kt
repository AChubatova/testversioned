package Tiger0924

import Tiger0924.buildTypes.*
import Tiger0924.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0924")
    name = "Tiger0924"

    vcsRoot(Tiger0924_cVCSroot)

    buildType(Tiger0924_Hi0)
    buildType(Tiger0924_Hi1)
    buildType(Tiger0924_Hi2)
    buildType(Tiger0924_Hi3)
})

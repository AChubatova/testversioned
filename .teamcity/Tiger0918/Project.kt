package Tiger0918

import Tiger0918.buildTypes.*
import Tiger0918.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0918")
    name = "Tiger0918"

    vcsRoot(Tiger0918_cVCSroot)

    buildType(Tiger0918_Hi0)
    buildType(Tiger0918_Hi1)
    buildType(Tiger0918_Hi2)
    buildType(Tiger0918_Hi3)
})

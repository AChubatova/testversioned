package Tiger0925

import Tiger0925.buildTypes.*
import Tiger0925.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0925")
    name = "Tiger0925"

    vcsRoot(Tiger0925_cVCSroot)

    buildType(Tiger0925_Hi3)
    buildType(Tiger0925_Hi2)
    buildType(Tiger0925_Hi1)
    buildType(Tiger0925_Hi0)
})

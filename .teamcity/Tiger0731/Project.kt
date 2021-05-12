package Tiger0731

import Tiger0731.buildTypes.*
import Tiger0731.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0731")
    name = "Tiger0731"

    vcsRoot(Tiger0731_cVCSroot)

    buildType(Tiger0731_Hi3)
    buildType(Tiger0731_Hi2)
    buildType(Tiger0731_Hi1)
    buildType(Tiger0731_Hi0)
})

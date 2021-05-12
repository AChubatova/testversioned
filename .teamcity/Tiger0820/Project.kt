package Tiger0820

import Tiger0820.buildTypes.*
import Tiger0820.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0820")
    name = "Tiger0820"

    vcsRoot(Tiger0820_cVCSroot)

    buildType(Tiger0820_Hi3)
    buildType(Tiger0820_Hi1)
    buildType(Tiger0820_Hi2)
    buildType(Tiger0820_Hi0)
})

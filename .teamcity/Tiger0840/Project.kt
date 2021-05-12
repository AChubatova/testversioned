package Tiger0840

import Tiger0840.buildTypes.*
import Tiger0840.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0840")
    name = "Tiger0840"

    vcsRoot(Tiger0840_cVCSroot)

    buildType(Tiger0840_Hi1)
    buildType(Tiger0840_Hi2)
    buildType(Tiger0840_Hi3)
    buildType(Tiger0840_Hi0)
})

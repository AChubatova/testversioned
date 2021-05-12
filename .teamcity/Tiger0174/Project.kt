package Tiger0174

import Tiger0174.buildTypes.*
import Tiger0174.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0174")
    name = "Tiger0174"

    vcsRoot(Tiger0174_cVCSroot)

    buildType(Tiger0174_Hi2)
    buildType(Tiger0174_Hi1)
    buildType(Tiger0174_Hi0)
    buildType(Tiger0174_Hi3)
})

package Tiger0180

import Tiger0180.buildTypes.*
import Tiger0180.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0180")
    name = "Tiger0180"

    vcsRoot(Tiger0180_cVCSroot)

    buildType(Tiger0180_Hi3)
    buildType(Tiger0180_Hi2)
    buildType(Tiger0180_Hi1)
    buildType(Tiger0180_Hi0)
})

package Tiger0737

import Tiger0737.buildTypes.*
import Tiger0737.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0737")
    name = "Tiger0737"

    vcsRoot(Tiger0737_cVCSroot)

    buildType(Tiger0737_Hi1)
    buildType(Tiger0737_Hi0)
    buildType(Tiger0737_Hi3)
    buildType(Tiger0737_Hi2)
})

package Tiger0151

import Tiger0151.buildTypes.*
import Tiger0151.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0151")
    name = "Tiger0151"

    vcsRoot(Tiger0151_cVCSroot)

    buildType(Tiger0151_Hi3)
    buildType(Tiger0151_Hi2)
    buildType(Tiger0151_Hi1)
    buildType(Tiger0151_Hi0)
})

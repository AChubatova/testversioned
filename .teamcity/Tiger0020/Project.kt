package Tiger0020

import Tiger0020.buildTypes.*
import Tiger0020.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0020")
    name = "Tiger0020"

    vcsRoot(Tiger0020_cVCSroot)

    buildType(Tiger0020_Hi0)
    buildType(Tiger0020_Hi1)
    buildType(Tiger0020_Hi2)
    buildType(Tiger0020_Hi3)
})

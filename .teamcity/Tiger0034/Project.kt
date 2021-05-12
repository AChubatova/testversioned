package Tiger0034

import Tiger0034.buildTypes.*
import Tiger0034.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0034")
    name = "Tiger0034"

    vcsRoot(Tiger0034_cVCSroot)

    buildType(Tiger0034_Hi1)
    buildType(Tiger0034_Hi0)
    buildType(Tiger0034_Hi3)
    buildType(Tiger0034_Hi2)
})

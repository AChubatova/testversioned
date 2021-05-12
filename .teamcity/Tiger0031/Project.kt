package Tiger0031

import Tiger0031.buildTypes.*
import Tiger0031.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0031")
    name = "Tiger0031"

    vcsRoot(Tiger0031_cVCSroot)

    buildType(Tiger0031_Hi2)
    buildType(Tiger0031_Hi1)
    buildType(Tiger0031_Hi0)
    buildType(Tiger0031_Hi3)
})

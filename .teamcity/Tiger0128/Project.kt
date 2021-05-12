package Tiger0128

import Tiger0128.buildTypes.*
import Tiger0128.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0128")
    name = "Tiger0128"

    vcsRoot(Tiger0128_cVCSroot)

    buildType(Tiger0128_Hi3)
    buildType(Tiger0128_Hi2)
    buildType(Tiger0128_Hi1)
    buildType(Tiger0128_Hi0)
})

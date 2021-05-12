package Tiger0929

import Tiger0929.buildTypes.*
import Tiger0929.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0929")
    name = "Tiger0929"

    vcsRoot(Tiger0929_cVCSroot)

    buildType(Tiger0929_Hi0)
    buildType(Tiger0929_Hi3)
    buildType(Tiger0929_Hi2)
    buildType(Tiger0929_Hi1)
})

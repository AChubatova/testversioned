package Tiger0339

import Tiger0339.buildTypes.*
import Tiger0339.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0339")
    name = "Tiger0339"

    vcsRoot(Tiger0339_cVCSroot)

    buildType(Tiger0339_Hi2)
    buildType(Tiger0339_Hi3)
    buildType(Tiger0339_Hi0)
    buildType(Tiger0339_Hi1)
})

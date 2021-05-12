package Tiger0036

import Tiger0036.buildTypes.*
import Tiger0036.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0036")
    name = "Tiger0036"

    vcsRoot(Tiger0036_cVCSroot)

    buildType(Tiger0036_Hi1)
    buildType(Tiger0036_Hi0)
    buildType(Tiger0036_Hi3)
    buildType(Tiger0036_Hi2)
})

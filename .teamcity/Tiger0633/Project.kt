package Tiger0633

import Tiger0633.buildTypes.*
import Tiger0633.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0633")
    name = "Tiger0633"

    vcsRoot(Tiger0633_cVCSroot)

    buildType(Tiger0633_Hi3)
    buildType(Tiger0633_Hi0)
    buildType(Tiger0633_Hi1)
    buildType(Tiger0633_Hi2)
})

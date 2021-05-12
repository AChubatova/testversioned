package Tiger0160

import Tiger0160.buildTypes.*
import Tiger0160.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0160")
    name = "Tiger0160"

    vcsRoot(Tiger0160_cVCSroot)

    buildType(Tiger0160_Hi0)
    buildType(Tiger0160_Hi1)
    buildType(Tiger0160_Hi2)
    buildType(Tiger0160_Hi3)
})

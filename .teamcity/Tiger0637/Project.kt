package Tiger0637

import Tiger0637.buildTypes.*
import Tiger0637.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0637")
    name = "Tiger0637"

    vcsRoot(Tiger0637_cVCSroot)

    buildType(Tiger0637_Hi3)
    buildType(Tiger0637_Hi0)
    buildType(Tiger0637_Hi2)
    buildType(Tiger0637_Hi1)
})

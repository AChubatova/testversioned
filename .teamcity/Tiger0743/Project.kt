package Tiger0743

import Tiger0743.buildTypes.*
import Tiger0743.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0743")
    name = "Tiger0743"

    vcsRoot(Tiger0743_cVCSroot)

    buildType(Tiger0743_Hi3)
    buildType(Tiger0743_Hi0)
    buildType(Tiger0743_Hi1)
    buildType(Tiger0743_Hi2)
})

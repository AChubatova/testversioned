package Tiger0140

import Tiger0140.buildTypes.*
import Tiger0140.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0140")
    name = "Tiger0140"

    vcsRoot(Tiger0140_cVCSroot)

    buildType(Tiger0140_Hi0)
    buildType(Tiger0140_Hi1)
    buildType(Tiger0140_Hi2)
    buildType(Tiger0140_Hi3)
})

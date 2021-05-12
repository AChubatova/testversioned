package Tiger0131

import Tiger0131.buildTypes.*
import Tiger0131.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0131")
    name = "Tiger0131"

    vcsRoot(Tiger0131_cVCSroot)

    buildType(Tiger0131_Hi3)
    buildType(Tiger0131_Hi2)
    buildType(Tiger0131_Hi1)
    buildType(Tiger0131_Hi0)
})

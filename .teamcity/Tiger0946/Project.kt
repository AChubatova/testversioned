package Tiger0946

import Tiger0946.buildTypes.*
import Tiger0946.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0946")
    name = "Tiger0946"

    vcsRoot(Tiger0946_cVCSroot)

    buildType(Tiger0946_Hi2)
    buildType(Tiger0946_Hi3)
    buildType(Tiger0946_Hi0)
    buildType(Tiger0946_Hi1)
})

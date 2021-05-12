package Tiger0634

import Tiger0634.buildTypes.*
import Tiger0634.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0634")
    name = "Tiger0634"

    vcsRoot(Tiger0634_cVCSroot)

    buildType(Tiger0634_Hi3)
    buildType(Tiger0634_Hi2)
    buildType(Tiger0634_Hi1)
    buildType(Tiger0634_Hi0)
})

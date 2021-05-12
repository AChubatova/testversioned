package Tiger0834

import Tiger0834.buildTypes.*
import Tiger0834.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0834")
    name = "Tiger0834"

    vcsRoot(Tiger0834_cVCSroot)

    buildType(Tiger0834_Hi3)
    buildType(Tiger0834_Hi2)
    buildType(Tiger0834_Hi1)
    buildType(Tiger0834_Hi0)
})

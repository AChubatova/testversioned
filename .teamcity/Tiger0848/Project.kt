package Tiger0848

import Tiger0848.buildTypes.*
import Tiger0848.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0848")
    name = "Tiger0848"

    vcsRoot(Tiger0848_cVCSroot)

    buildType(Tiger0848_Hi1)
    buildType(Tiger0848_Hi2)
    buildType(Tiger0848_Hi3)
    buildType(Tiger0848_Hi0)
})

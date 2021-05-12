package Tiger01546

import Tiger01546.buildTypes.*
import Tiger01546.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01546")
    name = "Tiger01546"

    vcsRoot(Tiger01546_cVCSroot)

    buildType(Tiger01546_Hi0)
    buildType(Tiger01546_Hi3)
    buildType(Tiger01546_Hi1)
    buildType(Tiger01546_Hi2)
})

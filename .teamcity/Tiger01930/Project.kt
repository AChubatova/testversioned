package Tiger01930

import Tiger01930.buildTypes.*
import Tiger01930.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01930")
    name = "Tiger01930"

    vcsRoot(Tiger01930_cVCSroot)

    buildType(Tiger01930_Hi1)
    buildType(Tiger01930_Hi0)
    buildType(Tiger01930_Hi3)
    buildType(Tiger01930_Hi2)
})

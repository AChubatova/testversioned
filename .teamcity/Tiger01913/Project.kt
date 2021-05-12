package Tiger01913

import Tiger01913.buildTypes.*
import Tiger01913.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01913")
    name = "Tiger01913"

    vcsRoot(Tiger01913_cVCSroot)

    buildType(Tiger01913_Hi3)
    buildType(Tiger01913_Hi1)
    buildType(Tiger01913_Hi2)
    buildType(Tiger01913_Hi0)
})

package Tiger01833

import Tiger01833.buildTypes.*
import Tiger01833.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01833")
    name = "Tiger01833"

    vcsRoot(Tiger01833_cVCSroot)

    buildType(Tiger01833_Hi1)
    buildType(Tiger01833_Hi0)
    buildType(Tiger01833_Hi3)
    buildType(Tiger01833_Hi2)
})

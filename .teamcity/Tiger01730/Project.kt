package Tiger01730

import Tiger01730.buildTypes.*
import Tiger01730.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01730")
    name = "Tiger01730"

    vcsRoot(Tiger01730_cVCSroot)

    buildType(Tiger01730_Hi1)
    buildType(Tiger01730_Hi0)
    buildType(Tiger01730_Hi3)
    buildType(Tiger01730_Hi2)
})

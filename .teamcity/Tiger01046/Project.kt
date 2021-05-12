package Tiger01046

import Tiger01046.buildTypes.*
import Tiger01046.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01046")
    name = "Tiger01046"

    vcsRoot(Tiger01046_cVCSroot)

    buildType(Tiger01046_Hi3)
    buildType(Tiger01046_Hi2)
    buildType(Tiger01046_Hi1)
    buildType(Tiger01046_Hi0)
})

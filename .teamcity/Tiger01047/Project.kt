package Tiger01047

import Tiger01047.buildTypes.*
import Tiger01047.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01047")
    name = "Tiger01047"

    vcsRoot(Tiger01047_cVCSroot)

    buildType(Tiger01047_Hi2)
    buildType(Tiger01047_Hi1)
    buildType(Tiger01047_Hi3)
    buildType(Tiger01047_Hi0)
})

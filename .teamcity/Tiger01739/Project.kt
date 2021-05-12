package Tiger01739

import Tiger01739.buildTypes.*
import Tiger01739.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01739")
    name = "Tiger01739"

    vcsRoot(Tiger01739_cVCSroot)

    buildType(Tiger01739_Hi0)
    buildType(Tiger01739_Hi1)
    buildType(Tiger01739_Hi2)
    buildType(Tiger01739_Hi3)
})

package Tiger01640

import Tiger01640.buildTypes.*
import Tiger01640.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01640")
    name = "Tiger01640"

    vcsRoot(Tiger01640_cVCSroot)

    buildType(Tiger01640_Hi3)
    buildType(Tiger01640_Hi2)
    buildType(Tiger01640_Hi1)
    buildType(Tiger01640_Hi0)
})

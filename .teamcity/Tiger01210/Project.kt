package Tiger01210

import Tiger01210.buildTypes.*
import Tiger01210.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01210")
    name = "Tiger01210"

    vcsRoot(Tiger01210_cVCSroot)

    buildType(Tiger01210_Hi0)
    buildType(Tiger01210_Hi1)
    buildType(Tiger01210_Hi2)
    buildType(Tiger01210_Hi3)
})

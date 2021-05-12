package Tiger01126

import Tiger01126.buildTypes.*
import Tiger01126.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01126")
    name = "Tiger01126"

    vcsRoot(Tiger01126_cVCSroot)

    buildType(Tiger01126_Hi2)
    buildType(Tiger01126_Hi1)
    buildType(Tiger01126_Hi0)
    buildType(Tiger01126_Hi3)
})

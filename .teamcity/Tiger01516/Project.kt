package Tiger01516

import Tiger01516.buildTypes.*
import Tiger01516.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01516")
    name = "Tiger01516"

    vcsRoot(Tiger01516_cVCSroot)

    buildType(Tiger01516_Hi3)
    buildType(Tiger01516_Hi2)
    buildType(Tiger01516_Hi1)
    buildType(Tiger01516_Hi0)
})

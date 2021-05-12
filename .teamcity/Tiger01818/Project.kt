package Tiger01818

import Tiger01818.buildTypes.*
import Tiger01818.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01818")
    name = "Tiger01818"

    vcsRoot(Tiger01818_cVCSroot)

    buildType(Tiger01818_Hi3)
    buildType(Tiger01818_Hi1)
    buildType(Tiger01818_Hi2)
    buildType(Tiger01818_Hi0)
})

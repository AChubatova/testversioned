package Tiger01912

import Tiger01912.buildTypes.*
import Tiger01912.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01912")
    name = "Tiger01912"

    vcsRoot(Tiger01912_cVCSroot)

    buildType(Tiger01912_Hi0)
    buildType(Tiger01912_Hi1)
    buildType(Tiger01912_Hi2)
    buildType(Tiger01912_Hi3)
})

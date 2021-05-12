package Tiger01646

import Tiger01646.buildTypes.*
import Tiger01646.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01646")
    name = "Tiger01646"

    vcsRoot(Tiger01646_cVCSroot)

    buildType(Tiger01646_Hi0)
    buildType(Tiger01646_Hi1)
    buildType(Tiger01646_Hi2)
    buildType(Tiger01646_Hi3)
})

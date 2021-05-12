package Tiger01647

import Tiger01647.buildTypes.*
import Tiger01647.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01647")
    name = "Tiger01647"

    vcsRoot(Tiger01647_cVCSroot)

    buildType(Tiger01647_Hi1)
    buildType(Tiger01647_Hi2)
    buildType(Tiger01647_Hi0)
    buildType(Tiger01647_Hi3)
})

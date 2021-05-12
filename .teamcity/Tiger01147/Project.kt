package Tiger01147

import Tiger01147.buildTypes.*
import Tiger01147.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01147")
    name = "Tiger01147"

    vcsRoot(Tiger01147_cVCSroot)

    buildType(Tiger01147_Hi3)
    buildType(Tiger01147_Hi2)
    buildType(Tiger01147_Hi1)
    buildType(Tiger01147_Hi0)
})

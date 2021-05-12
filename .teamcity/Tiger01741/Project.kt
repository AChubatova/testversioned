package Tiger01741

import Tiger01741.buildTypes.*
import Tiger01741.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01741")
    name = "Tiger01741"

    vcsRoot(Tiger01741_cVCSroot)

    buildType(Tiger01741_Hi0)
    buildType(Tiger01741_Hi1)
    buildType(Tiger01741_Hi2)
    buildType(Tiger01741_Hi3)
})

package Tiger01017

import Tiger01017.buildTypes.*
import Tiger01017.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01017")
    name = "Tiger01017"

    vcsRoot(Tiger01017_cVCSroot)

    buildType(Tiger01017_Hi0)
    buildType(Tiger01017_Hi1)
    buildType(Tiger01017_Hi2)
    buildType(Tiger01017_Hi3)
})

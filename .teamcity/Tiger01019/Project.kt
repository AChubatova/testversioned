package Tiger01019

import Tiger01019.buildTypes.*
import Tiger01019.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01019")
    name = "Tiger01019"

    vcsRoot(Tiger01019_cVCSroot)

    buildType(Tiger01019_Hi2)
    buildType(Tiger01019_Hi3)
    buildType(Tiger01019_Hi0)
    buildType(Tiger01019_Hi1)
})

package Tiger01816

import Tiger01816.buildTypes.*
import Tiger01816.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01816")
    name = "Tiger01816"

    vcsRoot(Tiger01816_cVCSroot)

    buildType(Tiger01816_Hi1)
    buildType(Tiger01816_Hi2)
    buildType(Tiger01816_Hi0)
    buildType(Tiger01816_Hi3)
})

package Tiger01735

import Tiger01735.buildTypes.*
import Tiger01735.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01735")
    name = "Tiger01735"

    vcsRoot(Tiger01735_cVCSroot)

    buildType(Tiger01735_Hi3)
    buildType(Tiger01735_Hi2)
    buildType(Tiger01735_Hi1)
    buildType(Tiger01735_Hi0)
})

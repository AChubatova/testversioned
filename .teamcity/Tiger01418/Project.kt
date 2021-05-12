package Tiger01418

import Tiger01418.buildTypes.*
import Tiger01418.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01418")
    name = "Tiger01418"

    vcsRoot(Tiger01418_cVCSroot)

    buildType(Tiger01418_Hi2)
    buildType(Tiger01418_Hi1)
    buildType(Tiger01418_Hi3)
    buildType(Tiger01418_Hi0)
})

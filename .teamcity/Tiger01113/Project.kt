package Tiger01113

import Tiger01113.buildTypes.*
import Tiger01113.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01113")
    name = "Tiger01113"

    vcsRoot(Tiger01113_cVCSroot)

    buildType(Tiger01113_Hi1)
    buildType(Tiger01113_Hi2)
    buildType(Tiger01113_Hi3)
    buildType(Tiger01113_Hi0)
})

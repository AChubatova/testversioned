package Tiger01819

import Tiger01819.buildTypes.*
import Tiger01819.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01819")
    name = "Tiger01819"

    vcsRoot(Tiger01819_cVCSroot)

    buildType(Tiger01819_Hi0)
    buildType(Tiger01819_Hi1)
    buildType(Tiger01819_Hi2)
    buildType(Tiger01819_Hi3)
})

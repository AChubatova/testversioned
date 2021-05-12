package Tiger01523

import Tiger01523.buildTypes.*
import Tiger01523.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01523")
    name = "Tiger01523"

    vcsRoot(Tiger01523_cVCSroot)

    buildType(Tiger01523_Hi0)
    buildType(Tiger01523_Hi1)
    buildType(Tiger01523_Hi2)
    buildType(Tiger01523_Hi3)
})

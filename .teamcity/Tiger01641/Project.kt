package Tiger01641

import Tiger01641.buildTypes.*
import Tiger01641.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01641")
    name = "Tiger01641"

    vcsRoot(Tiger01641_cVCSroot)

    buildType(Tiger01641_Hi2)
    buildType(Tiger01641_Hi1)
    buildType(Tiger01641_Hi3)
    buildType(Tiger01641_Hi0)
})

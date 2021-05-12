package Tiger01621

import Tiger01621.buildTypes.*
import Tiger01621.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01621")
    name = "Tiger01621"

    vcsRoot(Tiger01621_cVCSroot)

    buildType(Tiger01621_Hi3)
    buildType(Tiger01621_Hi0)
    buildType(Tiger01621_Hi1)
    buildType(Tiger01621_Hi2)
})

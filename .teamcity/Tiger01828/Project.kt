package Tiger01828

import Tiger01828.buildTypes.*
import Tiger01828.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01828")
    name = "Tiger01828"

    vcsRoot(Tiger01828_cVCSroot)

    buildType(Tiger01828_Hi1)
    buildType(Tiger01828_Hi0)
    buildType(Tiger01828_Hi3)
    buildType(Tiger01828_Hi2)
})

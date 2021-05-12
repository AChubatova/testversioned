package Tiger01626

import Tiger01626.buildTypes.*
import Tiger01626.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01626")
    name = "Tiger01626"

    vcsRoot(Tiger01626_cVCSroot)

    buildType(Tiger01626_Hi0)
    buildType(Tiger01626_Hi1)
    buildType(Tiger01626_Hi2)
    buildType(Tiger01626_Hi3)
})

package Tiger01540

import Tiger01540.buildTypes.*
import Tiger01540.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01540")
    name = "Tiger01540"

    vcsRoot(Tiger01540_cVCSroot)

    buildType(Tiger01540_Hi0)
    buildType(Tiger01540_Hi2)
    buildType(Tiger01540_Hi1)
    buildType(Tiger01540_Hi3)
})

package Tiger01447

import Tiger01447.buildTypes.*
import Tiger01447.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01447")
    name = "Tiger01447"

    vcsRoot(Tiger01447_cVCSroot)

    buildType(Tiger01447_Hi3)
    buildType(Tiger01447_Hi1)
    buildType(Tiger01447_Hi2)
    buildType(Tiger01447_Hi0)
})

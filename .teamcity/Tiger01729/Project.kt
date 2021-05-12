package Tiger01729

import Tiger01729.buildTypes.*
import Tiger01729.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01729")
    name = "Tiger01729"

    vcsRoot(Tiger01729_cVCSroot)

    buildType(Tiger01729_Hi3)
    buildType(Tiger01729_Hi2)
    buildType(Tiger01729_Hi1)
    buildType(Tiger01729_Hi0)
})

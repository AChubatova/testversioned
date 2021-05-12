package Tiger01427

import Tiger01427.buildTypes.*
import Tiger01427.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01427")
    name = "Tiger01427"

    vcsRoot(Tiger01427_cVCSroot)

    buildType(Tiger01427_Hi3)
    buildType(Tiger01427_Hi0)
    buildType(Tiger01427_Hi1)
    buildType(Tiger01427_Hi2)
})

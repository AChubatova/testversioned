package Tiger01629

import Tiger01629.buildTypes.*
import Tiger01629.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01629")
    name = "Tiger01629"

    vcsRoot(Tiger01629_cVCSroot)

    buildType(Tiger01629_Hi0)
    buildType(Tiger01629_Hi1)
    buildType(Tiger01629_Hi2)
    buildType(Tiger01629_Hi3)
})

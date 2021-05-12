package Tiger01643

import Tiger01643.buildTypes.*
import Tiger01643.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01643")
    name = "Tiger01643"

    vcsRoot(Tiger01643_cVCSroot)

    buildType(Tiger01643_Hi1)
    buildType(Tiger01643_Hi2)
    buildType(Tiger01643_Hi0)
    buildType(Tiger01643_Hi3)
})

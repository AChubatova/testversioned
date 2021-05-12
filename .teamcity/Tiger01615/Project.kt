package Tiger01615

import Tiger01615.buildTypes.*
import Tiger01615.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01615")
    name = "Tiger01615"

    vcsRoot(Tiger01615_cVCSroot)

    buildType(Tiger01615_Hi3)
    buildType(Tiger01615_Hi2)
    buildType(Tiger01615_Hi1)
    buildType(Tiger01615_Hi0)
})

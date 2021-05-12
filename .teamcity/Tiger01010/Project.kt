package Tiger01010

import Tiger01010.buildTypes.*
import Tiger01010.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01010")
    name = "Tiger01010"

    vcsRoot(Tiger01010_cVCSroot)

    buildType(Tiger01010_Hi3)
    buildType(Tiger01010_Hi2)
    buildType(Tiger01010_Hi1)
    buildType(Tiger01010_Hi0)
})

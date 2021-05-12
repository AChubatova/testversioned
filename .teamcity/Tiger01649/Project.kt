package Tiger01649

import Tiger01649.buildTypes.*
import Tiger01649.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01649")
    name = "Tiger01649"

    vcsRoot(Tiger01649_cVCSroot)

    buildType(Tiger01649_Hi3)
    buildType(Tiger01649_Hi1)
    buildType(Tiger01649_Hi2)
    buildType(Tiger01649_Hi0)
})

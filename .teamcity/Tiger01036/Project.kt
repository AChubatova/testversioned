package Tiger01036

import Tiger01036.buildTypes.*
import Tiger01036.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01036")
    name = "Tiger01036"

    vcsRoot(Tiger01036_cVCSroot)

    buildType(Tiger01036_Hi0)
    buildType(Tiger01036_Hi3)
    buildType(Tiger01036_Hi1)
    buildType(Tiger01036_Hi2)
})

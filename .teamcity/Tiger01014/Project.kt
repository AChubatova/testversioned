package Tiger01014

import Tiger01014.buildTypes.*
import Tiger01014.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01014")
    name = "Tiger01014"

    vcsRoot(Tiger01014_cVCSroot)

    buildType(Tiger01014_Hi1)
    buildType(Tiger01014_Hi2)
    buildType(Tiger01014_Hi3)
    buildType(Tiger01014_Hi0)
})

package Tiger01924

import Tiger01924.buildTypes.*
import Tiger01924.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01924")
    name = "Tiger01924"

    vcsRoot(Tiger01924_cVCSroot)

    buildType(Tiger01924_Hi0)
    buildType(Tiger01924_Hi2)
    buildType(Tiger01924_Hi1)
    buildType(Tiger01924_Hi3)
})

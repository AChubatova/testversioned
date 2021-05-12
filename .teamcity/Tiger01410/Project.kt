package Tiger01410

import Tiger01410.buildTypes.*
import Tiger01410.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01410")
    name = "Tiger01410"

    vcsRoot(Tiger01410_cVCSroot)

    buildType(Tiger01410_Hi1)
    buildType(Tiger01410_Hi2)
    buildType(Tiger01410_Hi3)
    buildType(Tiger01410_Hi0)
})

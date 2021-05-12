package Tiger01028

import Tiger01028.buildTypes.*
import Tiger01028.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01028")
    name = "Tiger01028"

    vcsRoot(Tiger01028_cVCSroot)

    buildType(Tiger01028_Hi3)
    buildType(Tiger01028_Hi2)
    buildType(Tiger01028_Hi1)
    buildType(Tiger01028_Hi0)
})

package Tiger01323

import Tiger01323.buildTypes.*
import Tiger01323.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01323")
    name = "Tiger01323"

    vcsRoot(Tiger01323_cVCSroot)

    buildType(Tiger01323_Hi1)
    buildType(Tiger01323_Hi0)
    buildType(Tiger01323_Hi3)
    buildType(Tiger01323_Hi2)
})

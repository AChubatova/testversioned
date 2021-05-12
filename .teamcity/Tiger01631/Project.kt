package Tiger01631

import Tiger01631.buildTypes.*
import Tiger01631.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01631")
    name = "Tiger01631"

    vcsRoot(Tiger01631_cVCSroot)

    buildType(Tiger01631_Hi1)
    buildType(Tiger01631_Hi0)
    buildType(Tiger01631_Hi3)
    buildType(Tiger01631_Hi2)
})

package Tiger01527

import Tiger01527.buildTypes.*
import Tiger01527.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01527")
    name = "Tiger01527"

    vcsRoot(Tiger01527_cVCSroot)

    buildType(Tiger01527_Hi0)
    buildType(Tiger01527_Hi1)
    buildType(Tiger01527_Hi2)
    buildType(Tiger01527_Hi3)
})

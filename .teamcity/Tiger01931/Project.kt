package Tiger01931

import Tiger01931.buildTypes.*
import Tiger01931.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01931")
    name = "Tiger01931"

    vcsRoot(Tiger01931_cVCSroot)

    buildType(Tiger01931_Hi0)
    buildType(Tiger01931_Hi3)
    buildType(Tiger01931_Hi2)
    buildType(Tiger01931_Hi1)
})

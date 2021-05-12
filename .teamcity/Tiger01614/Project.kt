package Tiger01614

import Tiger01614.buildTypes.*
import Tiger01614.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01614")
    name = "Tiger01614"

    vcsRoot(Tiger01614_cVCSroot)

    buildType(Tiger01614_Hi0)
    buildType(Tiger01614_Hi2)
    buildType(Tiger01614_Hi1)
    buildType(Tiger01614_Hi3)
})

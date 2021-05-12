package Tiger01334

import Tiger01334.buildTypes.*
import Tiger01334.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01334")
    name = "Tiger01334"

    vcsRoot(Tiger01334_cVCSroot)

    buildType(Tiger01334_Hi0)
    buildType(Tiger01334_Hi1)
    buildType(Tiger01334_Hi2)
    buildType(Tiger01334_Hi3)
})

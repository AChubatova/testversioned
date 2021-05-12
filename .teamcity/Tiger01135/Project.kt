package Tiger01135

import Tiger01135.buildTypes.*
import Tiger01135.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01135")
    name = "Tiger01135"

    vcsRoot(Tiger01135_cVCSroot)

    buildType(Tiger01135_Hi0)
    buildType(Tiger01135_Hi3)
    buildType(Tiger01135_Hi1)
    buildType(Tiger01135_Hi2)
})

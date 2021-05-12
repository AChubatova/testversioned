package Tiger01937

import Tiger01937.buildTypes.*
import Tiger01937.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01937")
    name = "Tiger01937"

    vcsRoot(Tiger01937_cVCSroot)

    buildType(Tiger01937_Hi0)
    buildType(Tiger01937_Hi1)
    buildType(Tiger01937_Hi2)
    buildType(Tiger01937_Hi3)
})

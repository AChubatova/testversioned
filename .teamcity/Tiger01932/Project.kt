package Tiger01932

import Tiger01932.buildTypes.*
import Tiger01932.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01932")
    name = "Tiger01932"

    vcsRoot(Tiger01932_cVCSroot)

    buildType(Tiger01932_Hi1)
    buildType(Tiger01932_Hi0)
    buildType(Tiger01932_Hi3)
    buildType(Tiger01932_Hi2)
})

package Tiger01134

import Tiger01134.buildTypes.*
import Tiger01134.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01134")
    name = "Tiger01134"

    vcsRoot(Tiger01134_cVCSroot)

    buildType(Tiger01134_Hi2)
    buildType(Tiger01134_Hi3)
    buildType(Tiger01134_Hi0)
    buildType(Tiger01134_Hi1)
})

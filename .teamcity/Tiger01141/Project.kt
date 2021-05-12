package Tiger01141

import Tiger01141.buildTypes.*
import Tiger01141.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01141")
    name = "Tiger01141"

    vcsRoot(Tiger01141_cVCSroot)

    buildType(Tiger01141_Hi2)
    buildType(Tiger01141_Hi3)
    buildType(Tiger01141_Hi0)
    buildType(Tiger01141_Hi1)
})

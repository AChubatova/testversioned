package Tiger01748

import Tiger01748.buildTypes.*
import Tiger01748.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01748")
    name = "Tiger01748"

    vcsRoot(Tiger01748_cVCSroot)

    buildType(Tiger01748_Hi3)
    buildType(Tiger01748_Hi1)
    buildType(Tiger01748_Hi2)
    buildType(Tiger01748_Hi0)
})

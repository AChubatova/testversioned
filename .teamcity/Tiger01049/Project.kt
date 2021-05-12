package Tiger01049

import Tiger01049.buildTypes.*
import Tiger01049.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01049")
    name = "Tiger01049"

    vcsRoot(Tiger01049_cVCSroot)

    buildType(Tiger01049_Hi0)
    buildType(Tiger01049_Hi2)
    buildType(Tiger01049_Hi1)
    buildType(Tiger01049_Hi3)
})

package Tiger089

import Tiger089.buildTypes.*
import Tiger089.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger089")
    name = "Tiger089"

    vcsRoot(Tiger089_cVCSroot)

    buildType(Tiger089_Hi1)
    buildType(Tiger089_Hi0)
    buildType(Tiger089_Hi3)
    buildType(Tiger089_Hi2)
})

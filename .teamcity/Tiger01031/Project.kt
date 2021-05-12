package Tiger01031

import Tiger01031.buildTypes.*
import Tiger01031.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01031")
    name = "Tiger01031"

    vcsRoot(Tiger01031_cVCSroot)

    buildType(Tiger01031_Hi1)
    buildType(Tiger01031_Hi0)
    buildType(Tiger01031_Hi3)
    buildType(Tiger01031_Hi2)
})

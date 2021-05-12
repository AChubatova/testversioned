package Tiger01642

import Tiger01642.buildTypes.*
import Tiger01642.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01642")
    name = "Tiger01642"

    vcsRoot(Tiger01642_cVCSroot)

    buildType(Tiger01642_Hi0)
    buildType(Tiger01642_Hi1)
    buildType(Tiger01642_Hi2)
    buildType(Tiger01642_Hi3)
})

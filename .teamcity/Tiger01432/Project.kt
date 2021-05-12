package Tiger01432

import Tiger01432.buildTypes.*
import Tiger01432.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01432")
    name = "Tiger01432"

    vcsRoot(Tiger01432_cVCSroot)

    buildType(Tiger01432_Hi0)
    buildType(Tiger01432_Hi3)
    buildType(Tiger01432_Hi1)
    buildType(Tiger01432_Hi2)
})

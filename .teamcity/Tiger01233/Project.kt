package Tiger01233

import Tiger01233.buildTypes.*
import Tiger01233.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01233")
    name = "Tiger01233"

    vcsRoot(Tiger01233_cVCSroot)

    buildType(Tiger01233_Hi2)
    buildType(Tiger01233_Hi3)
    buildType(Tiger01233_Hi0)
    buildType(Tiger01233_Hi1)
})

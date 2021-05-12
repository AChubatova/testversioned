package Tiger01531

import Tiger01531.buildTypes.*
import Tiger01531.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01531")
    name = "Tiger01531"

    vcsRoot(Tiger01531_cVCSroot)

    buildType(Tiger01531_Hi0)
    buildType(Tiger01531_Hi3)
    buildType(Tiger01531_Hi1)
    buildType(Tiger01531_Hi2)
})

package Tiger01645

import Tiger01645.buildTypes.*
import Tiger01645.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01645")
    name = "Tiger01645"

    vcsRoot(Tiger01645_cVCSroot)

    buildType(Tiger01645_Hi3)
    buildType(Tiger01645_Hi1)
    buildType(Tiger01645_Hi2)
    buildType(Tiger01645_Hi0)
})

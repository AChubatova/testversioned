package Tiger01514

import Tiger01514.buildTypes.*
import Tiger01514.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01514")
    name = "Tiger01514"

    vcsRoot(Tiger01514_cVCSroot)

    buildType(Tiger01514_Hi3)
    buildType(Tiger01514_Hi2)
    buildType(Tiger01514_Hi1)
    buildType(Tiger01514_Hi0)
})

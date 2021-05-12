package Tiger01839

import Tiger01839.buildTypes.*
import Tiger01839.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01839")
    name = "Tiger01839"

    vcsRoot(Tiger01839_cVCSroot)

    buildType(Tiger01839_Hi0)
    buildType(Tiger01839_Hi1)
    buildType(Tiger01839_Hi2)
    buildType(Tiger01839_Hi3)
})

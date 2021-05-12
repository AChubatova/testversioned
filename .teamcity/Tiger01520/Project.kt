package Tiger01520

import Tiger01520.buildTypes.*
import Tiger01520.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01520")
    name = "Tiger01520"

    vcsRoot(Tiger01520_cVCSroot)

    buildType(Tiger01520_Hi3)
    buildType(Tiger01520_Hi2)
    buildType(Tiger01520_Hi1)
    buildType(Tiger01520_Hi0)
})

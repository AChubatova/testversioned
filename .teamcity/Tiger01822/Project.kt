package Tiger01822

import Tiger01822.buildTypes.*
import Tiger01822.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01822")
    name = "Tiger01822"

    vcsRoot(Tiger01822_cVCSroot)

    buildType(Tiger01822_Hi2)
    buildType(Tiger01822_Hi3)
    buildType(Tiger01822_Hi0)
    buildType(Tiger01822_Hi1)
})

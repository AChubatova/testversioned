package Tiger01521

import Tiger01521.buildTypes.*
import Tiger01521.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01521")
    name = "Tiger01521"

    vcsRoot(Tiger01521_cVCSroot)

    buildType(Tiger01521_Hi2)
    buildType(Tiger01521_Hi3)
    buildType(Tiger01521_Hi0)
    buildType(Tiger01521_Hi1)
})

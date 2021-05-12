package Tiger01510

import Tiger01510.buildTypes.*
import Tiger01510.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01510")
    name = "Tiger01510"

    vcsRoot(Tiger01510_cVCSroot)

    buildType(Tiger01510_Hi3)
    buildType(Tiger01510_Hi2)
    buildType(Tiger01510_Hi1)
    buildType(Tiger01510_Hi0)
})

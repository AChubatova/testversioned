package Tiger01425

import Tiger01425.buildTypes.*
import Tiger01425.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01425")
    name = "Tiger01425"

    vcsRoot(Tiger01425_cVCSroot)

    buildType(Tiger01425_Hi1)
    buildType(Tiger01425_Hi2)
    buildType(Tiger01425_Hi3)
    buildType(Tiger01425_Hi0)
})

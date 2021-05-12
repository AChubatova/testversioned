package Tiger01132

import Tiger01132.buildTypes.*
import Tiger01132.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01132")
    name = "Tiger01132"

    vcsRoot(Tiger01132_cVCSroot)

    buildType(Tiger01132_Hi0)
    buildType(Tiger01132_Hi1)
    buildType(Tiger01132_Hi2)
    buildType(Tiger01132_Hi3)
})

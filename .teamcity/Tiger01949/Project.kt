package Tiger01949

import Tiger01949.buildTypes.*
import Tiger01949.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01949")
    name = "Tiger01949"

    vcsRoot(Tiger01949_cVCSroot)

    buildType(Tiger01949_Hi1)
    buildType(Tiger01949_Hi0)
    buildType(Tiger01949_Hi3)
    buildType(Tiger01949_Hi2)
})

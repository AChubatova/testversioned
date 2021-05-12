package Tiger01325

import Tiger01325.buildTypes.*
import Tiger01325.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01325")
    name = "Tiger01325"

    vcsRoot(Tiger01325_cVCSroot)

    buildType(Tiger01325_Hi1)
    buildType(Tiger01325_Hi0)
    buildType(Tiger01325_Hi3)
    buildType(Tiger01325_Hi2)
})

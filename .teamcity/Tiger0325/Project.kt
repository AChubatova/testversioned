package Tiger0325

import Tiger0325.buildTypes.*
import Tiger0325.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0325")
    name = "Tiger0325"

    vcsRoot(Tiger0325_cVCSroot)

    buildType(Tiger0325_Hi0)
    buildType(Tiger0325_Hi2)
    buildType(Tiger0325_Hi1)
    buildType(Tiger0325_Hi3)
})

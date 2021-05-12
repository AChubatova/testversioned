package Tiger0734

import Tiger0734.buildTypes.*
import Tiger0734.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0734")
    name = "Tiger0734"

    vcsRoot(Tiger0734_cVCSroot)

    buildType(Tiger0734_Hi0)
    buildType(Tiger0734_Hi2)
    buildType(Tiger0734_Hi1)
    buildType(Tiger0734_Hi3)
})

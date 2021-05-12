package Tiger0326

import Tiger0326.buildTypes.*
import Tiger0326.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0326")
    name = "Tiger0326"

    vcsRoot(Tiger0326_cVCSroot)

    buildType(Tiger0326_Hi3)
    buildType(Tiger0326_Hi2)
    buildType(Tiger0326_Hi1)
    buildType(Tiger0326_Hi0)
})

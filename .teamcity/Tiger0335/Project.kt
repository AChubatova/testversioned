package Tiger0335

import Tiger0335.buildTypes.*
import Tiger0335.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0335")
    name = "Tiger0335"

    vcsRoot(Tiger0335_cVCSroot)

    buildType(Tiger0335_Hi2)
    buildType(Tiger0335_Hi3)
    buildType(Tiger0335_Hi0)
    buildType(Tiger0335_Hi1)
})

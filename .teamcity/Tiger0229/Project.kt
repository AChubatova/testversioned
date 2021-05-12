package Tiger0229

import Tiger0229.buildTypes.*
import Tiger0229.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0229")
    name = "Tiger0229"

    vcsRoot(Tiger0229_cVCSroot)

    buildType(Tiger0229_Hi3)
    buildType(Tiger0229_Hi2)
    buildType(Tiger0229_Hi1)
    buildType(Tiger0229_Hi0)
})

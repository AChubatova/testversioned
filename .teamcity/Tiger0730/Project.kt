package Tiger0730

import Tiger0730.buildTypes.*
import Tiger0730.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0730")
    name = "Tiger0730"

    vcsRoot(Tiger0730_cVCSroot)

    buildType(Tiger0730_Hi0)
    buildType(Tiger0730_Hi1)
    buildType(Tiger0730_Hi2)
    buildType(Tiger0730_Hi3)
})

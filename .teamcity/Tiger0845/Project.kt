package Tiger0845

import Tiger0845.buildTypes.*
import Tiger0845.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0845")
    name = "Tiger0845"

    vcsRoot(Tiger0845_cVCSroot)

    buildType(Tiger0845_Hi2)
    buildType(Tiger0845_Hi3)
    buildType(Tiger0845_Hi0)
    buildType(Tiger0845_Hi1)
})

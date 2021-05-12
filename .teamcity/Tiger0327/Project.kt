package Tiger0327

import Tiger0327.buildTypes.*
import Tiger0327.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0327")
    name = "Tiger0327"

    vcsRoot(Tiger0327_cVCSroot)

    buildType(Tiger0327_Hi2)
    buildType(Tiger0327_Hi1)
    buildType(Tiger0327_Hi3)
    buildType(Tiger0327_Hi0)
})

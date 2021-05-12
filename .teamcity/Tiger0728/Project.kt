package Tiger0728

import Tiger0728.buildTypes.*
import Tiger0728.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0728")
    name = "Tiger0728"

    vcsRoot(Tiger0728_cVCSroot)

    buildType(Tiger0728_Hi0)
    buildType(Tiger0728_Hi1)
    buildType(Tiger0728_Hi2)
    buildType(Tiger0728_Hi3)
})

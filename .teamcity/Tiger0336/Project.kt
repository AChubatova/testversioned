package Tiger0336

import Tiger0336.buildTypes.*
import Tiger0336.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0336")
    name = "Tiger0336"

    vcsRoot(Tiger0336_cVCSroot)

    buildType(Tiger0336_Hi0)
    buildType(Tiger0336_Hi1)
    buildType(Tiger0336_Hi2)
    buildType(Tiger0336_Hi3)
})

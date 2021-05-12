package Tiger0136

import Tiger0136.buildTypes.*
import Tiger0136.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0136")
    name = "Tiger0136"

    vcsRoot(Tiger0136_cVCSroot)

    buildType(Tiger0136_Hi0)
    buildType(Tiger0136_Hi1)
    buildType(Tiger0136_Hi2)
    buildType(Tiger0136_Hi3)
})

package Tiger0185

import Tiger0185.buildTypes.*
import Tiger0185.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0185")
    name = "Tiger0185"

    vcsRoot(Tiger0185_cVCSroot)

    buildType(Tiger0185_Hi3)
    buildType(Tiger0185_Hi1)
    buildType(Tiger0185_Hi2)
    buildType(Tiger0185_Hi0)
})

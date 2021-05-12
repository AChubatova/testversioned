package Tiger0913

import Tiger0913.buildTypes.*
import Tiger0913.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0913")
    name = "Tiger0913"

    vcsRoot(Tiger0913_cVCSroot)

    buildType(Tiger0913_Hi3)
    buildType(Tiger0913_Hi2)
    buildType(Tiger0913_Hi1)
    buildType(Tiger0913_Hi0)
})

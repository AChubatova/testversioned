package Tiger0446

import Tiger0446.buildTypes.*
import Tiger0446.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0446")
    name = "Tiger0446"

    vcsRoot(Tiger0446_cVCSroot)

    buildType(Tiger0446_Hi3)
    buildType(Tiger0446_Hi2)
    buildType(Tiger0446_Hi1)
    buildType(Tiger0446_Hi0)
})

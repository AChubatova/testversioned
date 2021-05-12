package Tiger0139

import Tiger0139.buildTypes.*
import Tiger0139.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0139")
    name = "Tiger0139"

    vcsRoot(Tiger0139_cVCSroot)

    buildType(Tiger0139_Hi0)
    buildType(Tiger0139_Hi1)
    buildType(Tiger0139_Hi2)
    buildType(Tiger0139_Hi3)
})

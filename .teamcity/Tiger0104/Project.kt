package Tiger0104

import Tiger0104.buildTypes.*
import Tiger0104.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0104")
    name = "Tiger0104"

    vcsRoot(Tiger0104_cVCSroot)

    buildType(Tiger0104_Hi1)
    buildType(Tiger0104_Hi0)
    buildType(Tiger0104_Hi3)
    buildType(Tiger0104_Hi2)
})

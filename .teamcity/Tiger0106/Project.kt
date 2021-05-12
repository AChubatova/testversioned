package Tiger0106

import Tiger0106.buildTypes.*
import Tiger0106.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0106")
    name = "Tiger0106"

    vcsRoot(Tiger0106_cVCSroot)

    buildType(Tiger0106_Hi3)
    buildType(Tiger0106_Hi2)
    buildType(Tiger0106_Hi1)
    buildType(Tiger0106_Hi0)
})

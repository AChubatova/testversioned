package Tiger0733

import Tiger0733.buildTypes.*
import Tiger0733.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0733")
    name = "Tiger0733"

    vcsRoot(Tiger0733_cVCSroot)

    buildType(Tiger0733_Hi1)
    buildType(Tiger0733_Hi0)
    buildType(Tiger0733_Hi3)
    buildType(Tiger0733_Hi2)
})

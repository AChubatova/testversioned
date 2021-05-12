package Tiger0647

import Tiger0647.buildTypes.*
import Tiger0647.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0647")
    name = "Tiger0647"

    vcsRoot(Tiger0647_cVCSroot)

    buildType(Tiger0647_Hi2)
    buildType(Tiger0647_Hi3)
    buildType(Tiger0647_Hi0)
    buildType(Tiger0647_Hi1)
})

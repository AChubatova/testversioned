package Tiger0171

import Tiger0171.buildTypes.*
import Tiger0171.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0171")
    name = "Tiger0171"

    vcsRoot(Tiger0171_cVCSroot)

    buildType(Tiger0171_Hi3)
    buildType(Tiger0171_Hi2)
    buildType(Tiger0171_Hi1)
    buildType(Tiger0171_Hi0)
})

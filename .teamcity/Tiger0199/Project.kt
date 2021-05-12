package Tiger0199

import Tiger0199.buildTypes.*
import Tiger0199.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0199")
    name = "Tiger0199"

    vcsRoot(Tiger0199_cVCSroot)

    buildType(Tiger0199_Hi3)
    buildType(Tiger0199_Hi2)
    buildType(Tiger0199_Hi1)
    buildType(Tiger0199_Hi0)
})

package Tiger087

import Tiger087.buildTypes.*
import Tiger087.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger087")
    name = "Tiger087"

    vcsRoot(Tiger087_cVCSroot)

    buildType(Tiger087_Hi3)
    buildType(Tiger087_Hi2)
    buildType(Tiger087_Hi1)
    buildType(Tiger087_Hi0)
})

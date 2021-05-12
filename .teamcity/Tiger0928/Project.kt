package Tiger0928

import Tiger0928.buildTypes.*
import Tiger0928.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0928")
    name = "Tiger0928"

    vcsRoot(Tiger0928_cVCSroot)

    buildType(Tiger0928_Hi3)
    buildType(Tiger0928_Hi2)
    buildType(Tiger0928_Hi1)
    buildType(Tiger0928_Hi0)
})

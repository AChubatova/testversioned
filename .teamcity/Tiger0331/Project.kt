package Tiger0331

import Tiger0331.buildTypes.*
import Tiger0331.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0331")
    name = "Tiger0331"

    vcsRoot(Tiger0331_cVCSroot)

    buildType(Tiger0331_Hi2)
    buildType(Tiger0331_Hi3)
    buildType(Tiger0331_Hi0)
    buildType(Tiger0331_Hi1)
})

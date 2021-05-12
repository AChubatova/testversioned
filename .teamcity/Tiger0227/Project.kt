package Tiger0227

import Tiger0227.buildTypes.*
import Tiger0227.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0227")
    name = "Tiger0227"

    vcsRoot(Tiger0227_cVCSroot)

    buildType(Tiger0227_Hi1)
    buildType(Tiger0227_Hi0)
    buildType(Tiger0227_Hi3)
    buildType(Tiger0227_Hi2)
})

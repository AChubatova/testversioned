package Tiger0846

import Tiger0846.buildTypes.*
import Tiger0846.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0846")
    name = "Tiger0846"

    vcsRoot(Tiger0846_cVCSroot)

    buildType(Tiger0846_Hi0)
    buildType(Tiger0846_Hi1)
    buildType(Tiger0846_Hi2)
    buildType(Tiger0846_Hi3)
})

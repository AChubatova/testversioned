package Tiger0645

import Tiger0645.buildTypes.*
import Tiger0645.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0645")
    name = "Tiger0645"

    vcsRoot(Tiger0645_cVCSroot)

    buildType(Tiger0645_Hi2)
    buildType(Tiger0645_Hi3)
    buildType(Tiger0645_Hi0)
    buildType(Tiger0645_Hi1)
})

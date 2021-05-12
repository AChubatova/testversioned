package Tiger0343

import Tiger0343.buildTypes.*
import Tiger0343.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0343")
    name = "Tiger0343"

    vcsRoot(Tiger0343_cVCSroot)

    buildType(Tiger0343_Hi3)
    buildType(Tiger0343_Hi2)
    buildType(Tiger0343_Hi1)
    buildType(Tiger0343_Hi0)
})

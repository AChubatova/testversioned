package Tiger0932

import Tiger0932.buildTypes.*
import Tiger0932.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0932")
    name = "Tiger0932"

    vcsRoot(Tiger0932_cVCSroot)

    buildType(Tiger0932_Hi0)
    buildType(Tiger0932_Hi2)
    buildType(Tiger0932_Hi1)
    buildType(Tiger0932_Hi3)
})

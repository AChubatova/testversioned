package Tiger067

import Tiger067.buildTypes.*
import Tiger067.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger067")
    name = "Tiger067"

    vcsRoot(Tiger067_cVCSroot)

    buildType(Tiger067_Hi2)
    buildType(Tiger067_Hi3)
    buildType(Tiger067_Hi0)
    buildType(Tiger067_Hi1)
})

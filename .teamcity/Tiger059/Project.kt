package Tiger059

import Tiger059.buildTypes.*
import Tiger059.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger059")
    name = "Tiger059"

    vcsRoot(Tiger059_cVCSroot)

    buildType(Tiger059_Hi0)
    buildType(Tiger059_Hi2)
    buildType(Tiger059_Hi1)
    buildType(Tiger059_Hi3)
})

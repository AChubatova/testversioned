package Tiger074

import Tiger074.buildTypes.*
import Tiger074.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger074")
    name = "Tiger074"

    vcsRoot(Tiger074_cVCSroot)

    buildType(Tiger074_Hi0)
    buildType(Tiger074_Hi1)
    buildType(Tiger074_Hi2)
    buildType(Tiger074_Hi3)
})

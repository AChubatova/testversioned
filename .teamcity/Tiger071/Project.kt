package Tiger071

import Tiger071.buildTypes.*
import Tiger071.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger071")
    name = "Tiger071"

    vcsRoot(Tiger071_cVCSroot)

    buildType(Tiger071_Hi3)
    buildType(Tiger071_Hi1)
    buildType(Tiger071_Hi2)
    buildType(Tiger071_Hi0)
})

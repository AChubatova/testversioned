package Tiger0228

import Tiger0228.buildTypes.*
import Tiger0228.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0228")
    name = "Tiger0228"

    vcsRoot(Tiger0228_cVCSroot)

    buildType(Tiger0228_Hi0)
    buildType(Tiger0228_Hi2)
    buildType(Tiger0228_Hi1)
    buildType(Tiger0228_Hi3)
})

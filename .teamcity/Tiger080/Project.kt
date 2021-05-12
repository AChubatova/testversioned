package Tiger080

import Tiger080.buildTypes.*
import Tiger080.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger080")
    name = "Tiger080"

    vcsRoot(Tiger080_cVCSroot)

    buildType(Tiger080_Hi3)
    buildType(Tiger080_Hi0)
    buildType(Tiger080_Hi2)
    buildType(Tiger080_Hi1)
})

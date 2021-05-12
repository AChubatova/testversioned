package Tiger0725

import Tiger0725.buildTypes.*
import Tiger0725.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0725")
    name = "Tiger0725"

    vcsRoot(Tiger0725_cVCSroot)

    buildType(Tiger0725_Hi1)
    buildType(Tiger0725_Hi2)
    buildType(Tiger0725_Hi0)
    buildType(Tiger0725_Hi3)
})

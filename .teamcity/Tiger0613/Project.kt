package Tiger0613

import Tiger0613.buildTypes.*
import Tiger0613.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0613")
    name = "Tiger0613"

    vcsRoot(Tiger0613_cVCSroot)

    buildType(Tiger0613_Hi0)
    buildType(Tiger0613_Hi3)
    buildType(Tiger0613_Hi2)
    buildType(Tiger0613_Hi1)
})

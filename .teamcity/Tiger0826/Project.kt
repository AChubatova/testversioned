package Tiger0826

import Tiger0826.buildTypes.*
import Tiger0826.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0826")
    name = "Tiger0826"

    vcsRoot(Tiger0826_cVCSroot)

    buildType(Tiger0826_Hi3)
    buildType(Tiger0826_Hi1)
    buildType(Tiger0826_Hi2)
    buildType(Tiger0826_Hi0)
})

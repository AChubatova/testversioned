package Tiger0432

import Tiger0432.buildTypes.*
import Tiger0432.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0432")
    name = "Tiger0432"

    vcsRoot(Tiger0432_cVCSroot)

    buildType(Tiger0432_Hi0)
    buildType(Tiger0432_Hi1)
    buildType(Tiger0432_Hi2)
    buildType(Tiger0432_Hi3)
})

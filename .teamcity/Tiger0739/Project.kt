package Tiger0739

import Tiger0739.buildTypes.*
import Tiger0739.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0739")
    name = "Tiger0739"

    vcsRoot(Tiger0739_cVCSroot)

    buildType(Tiger0739_Hi3)
    buildType(Tiger0739_Hi2)
    buildType(Tiger0739_Hi1)
    buildType(Tiger0739_Hi0)
})

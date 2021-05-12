package Tiger0244

import Tiger0244.buildTypes.*
import Tiger0244.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0244")
    name = "Tiger0244"

    vcsRoot(Tiger0244_cVCSroot)

    buildType(Tiger0244_Hi3)
    buildType(Tiger0244_Hi1)
    buildType(Tiger0244_Hi2)
    buildType(Tiger0244_Hi0)
})

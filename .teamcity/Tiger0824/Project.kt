package Tiger0824

import Tiger0824.buildTypes.*
import Tiger0824.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0824")
    name = "Tiger0824"

    vcsRoot(Tiger0824_cVCSroot)

    buildType(Tiger0824_Hi1)
    buildType(Tiger0824_Hi2)
    buildType(Tiger0824_Hi0)
    buildType(Tiger0824_Hi3)
})

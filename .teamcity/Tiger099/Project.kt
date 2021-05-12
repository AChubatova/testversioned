package Tiger099

import Tiger099.buildTypes.*
import Tiger099.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger099")
    name = "Tiger099"

    vcsRoot(Tiger099_cVCSroot)

    buildType(Tiger099_Hi0)
    buildType(Tiger099_Hi1)
    buildType(Tiger099_Hi2)
    buildType(Tiger099_Hi3)
})

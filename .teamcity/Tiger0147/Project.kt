package Tiger0147

import Tiger0147.buildTypes.*
import Tiger0147.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0147")
    name = "Tiger0147"

    vcsRoot(Tiger0147_cVCSroot)

    buildType(Tiger0147_Hi0)
    buildType(Tiger0147_Hi3)
    buildType(Tiger0147_Hi2)
    buildType(Tiger0147_Hi1)
})

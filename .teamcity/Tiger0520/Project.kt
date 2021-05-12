package Tiger0520

import Tiger0520.buildTypes.*
import Tiger0520.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0520")
    name = "Tiger0520"

    vcsRoot(Tiger0520_cVCSroot)

    buildType(Tiger0520_Hi3)
    buildType(Tiger0520_Hi2)
    buildType(Tiger0520_Hi1)
    buildType(Tiger0520_Hi0)
})

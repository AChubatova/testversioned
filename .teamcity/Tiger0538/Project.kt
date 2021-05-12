package Tiger0538

import Tiger0538.buildTypes.*
import Tiger0538.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0538")
    name = "Tiger0538"

    vcsRoot(Tiger0538_cVCSroot)

    buildType(Tiger0538_Hi3)
    buildType(Tiger0538_Hi0)
    buildType(Tiger0538_Hi2)
    buildType(Tiger0538_Hi1)
})

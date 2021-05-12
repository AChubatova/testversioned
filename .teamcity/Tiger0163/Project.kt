package Tiger0163

import Tiger0163.buildTypes.*
import Tiger0163.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0163")
    name = "Tiger0163"

    vcsRoot(Tiger0163_cVCSroot)

    buildType(Tiger0163_Hi0)
    buildType(Tiger0163_Hi1)
    buildType(Tiger0163_Hi2)
    buildType(Tiger0163_Hi3)
})

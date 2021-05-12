package Tiger0037

import Tiger0037.buildTypes.*
import Tiger0037.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0037")
    name = "Tiger0037"

    vcsRoot(Tiger0037_cVCSroot)

    buildType(Tiger0037_Hi3)
    buildType(Tiger0037_Hi2)
    buildType(Tiger0037_Hi1)
    buildType(Tiger0037_Hi0)
})

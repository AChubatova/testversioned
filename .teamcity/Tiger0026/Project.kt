package Tiger0026

import Tiger0026.buildTypes.*
import Tiger0026.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0026")
    name = "Tiger0026"

    vcsRoot(Tiger0026_cVCSroot)

    buildType(Tiger0026_Hi2)
    buildType(Tiger0026_Hi1)
    buildType(Tiger0026_Hi3)
    buildType(Tiger0026_Hi0)
})

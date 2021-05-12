package Tiger0345

import Tiger0345.buildTypes.*
import Tiger0345.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0345")
    name = "Tiger0345"

    vcsRoot(Tiger0345_cVCSroot)

    buildType(Tiger0345_Hi0)
    buildType(Tiger0345_Hi3)
    buildType(Tiger0345_Hi2)
    buildType(Tiger0345_Hi1)
})

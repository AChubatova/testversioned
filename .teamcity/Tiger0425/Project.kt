package Tiger0425

import Tiger0425.buildTypes.*
import Tiger0425.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0425")
    name = "Tiger0425"

    vcsRoot(Tiger0425_cVCSroot)

    buildType(Tiger0425_Hi1)
    buildType(Tiger0425_Hi0)
    buildType(Tiger0425_Hi3)
    buildType(Tiger0425_Hi2)
})

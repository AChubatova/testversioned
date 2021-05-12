package Tiger0043

import Tiger0043.buildTypes.*
import Tiger0043.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0043")
    name = "Tiger0043"

    vcsRoot(Tiger0043_cVCSroot)

    buildType(Tiger0043_Hi0)
    buildType(Tiger0043_Hi1)
    buildType(Tiger0043_Hi2)
    buildType(Tiger0043_Hi3)
})

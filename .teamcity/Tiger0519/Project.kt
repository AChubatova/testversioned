package Tiger0519

import Tiger0519.buildTypes.*
import Tiger0519.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0519")
    name = "Tiger0519"

    vcsRoot(Tiger0519_cVCSroot)

    buildType(Tiger0519_Hi1)
    buildType(Tiger0519_Hi0)
    buildType(Tiger0519_Hi3)
    buildType(Tiger0519_Hi2)
})

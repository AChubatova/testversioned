package Tiger0164

import Tiger0164.buildTypes.*
import Tiger0164.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0164")
    name = "Tiger0164"

    vcsRoot(Tiger0164_cVCSroot)

    buildType(Tiger0164_Hi0)
    buildType(Tiger0164_Hi1)
    buildType(Tiger0164_Hi2)
    buildType(Tiger0164_Hi3)
})

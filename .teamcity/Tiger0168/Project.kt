package Tiger0168

import Tiger0168.buildTypes.*
import Tiger0168.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0168")
    name = "Tiger0168"

    vcsRoot(Tiger0168_cVCSroot)

    buildType(Tiger0168_Hi0)
    buildType(Tiger0168_Hi1)
    buildType(Tiger0168_Hi2)
    buildType(Tiger0168_Hi3)
})

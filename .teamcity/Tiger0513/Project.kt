package Tiger0513

import Tiger0513.buildTypes.*
import Tiger0513.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0513")
    name = "Tiger0513"

    vcsRoot(Tiger0513_cVCSroot)

    buildType(Tiger0513_Hi3)
    buildType(Tiger0513_Hi2)
    buildType(Tiger0513_Hi1)
    buildType(Tiger0513_Hi0)
})

package Tiger0148

import Tiger0148.buildTypes.*
import Tiger0148.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0148")
    name = "Tiger0148"

    vcsRoot(Tiger0148_cVCSroot)

    buildType(Tiger0148_Hi1)
    buildType(Tiger0148_Hi0)
    buildType(Tiger0148_Hi3)
    buildType(Tiger0148_Hi2)
})

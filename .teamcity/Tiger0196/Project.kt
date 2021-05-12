package Tiger0196

import Tiger0196.buildTypes.*
import Tiger0196.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0196")
    name = "Tiger0196"

    vcsRoot(Tiger0196_cVCSroot)

    buildType(Tiger0196_Hi3)
    buildType(Tiger0196_Hi0)
    buildType(Tiger0196_Hi2)
    buildType(Tiger0196_Hi1)
})

package Tiger0611

import Tiger0611.buildTypes.*
import Tiger0611.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0611")
    name = "Tiger0611"

    vcsRoot(Tiger0611_cVCSroot)

    buildType(Tiger0611_Hi2)
    buildType(Tiger0611_Hi1)
    buildType(Tiger0611_Hi0)
    buildType(Tiger0611_Hi3)
})

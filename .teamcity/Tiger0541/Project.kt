package Tiger0541

import Tiger0541.buildTypes.*
import Tiger0541.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0541")
    name = "Tiger0541"

    vcsRoot(Tiger0541_cVCSroot)

    buildType(Tiger0541_Hi3)
    buildType(Tiger0541_Hi2)
    buildType(Tiger0541_Hi1)
    buildType(Tiger0541_Hi0)
})

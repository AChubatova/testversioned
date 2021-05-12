package Tiger0155

import Tiger0155.buildTypes.*
import Tiger0155.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0155")
    name = "Tiger0155"

    vcsRoot(Tiger0155_cVCSroot)

    buildType(Tiger0155_Hi3)
    buildType(Tiger0155_Hi2)
    buildType(Tiger0155_Hi1)
    buildType(Tiger0155_Hi0)
})

package Tiger0717

import Tiger0717.buildTypes.*
import Tiger0717.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0717")
    name = "Tiger0717"

    vcsRoot(Tiger0717_cVCSroot)

    buildType(Tiger0717_Hi1)
    buildType(Tiger0717_Hi0)
    buildType(Tiger0717_Hi3)
    buildType(Tiger0717_Hi2)
})

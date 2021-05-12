package Tiger0421

import Tiger0421.buildTypes.*
import Tiger0421.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0421")
    name = "Tiger0421"

    vcsRoot(Tiger0421_cVCSroot)

    buildType(Tiger0421_Hi3)
    buildType(Tiger0421_Hi2)
    buildType(Tiger0421_Hi1)
    buildType(Tiger0421_Hi0)
})

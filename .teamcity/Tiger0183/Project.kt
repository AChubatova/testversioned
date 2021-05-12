package Tiger0183

import Tiger0183.buildTypes.*
import Tiger0183.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0183")
    name = "Tiger0183"

    vcsRoot(Tiger0183_cVCSroot)

    buildType(Tiger0183_Hi3)
    buildType(Tiger0183_Hi1)
    buildType(Tiger0183_Hi2)
    buildType(Tiger0183_Hi0)
})

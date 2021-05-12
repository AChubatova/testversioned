package Tiger0515

import Tiger0515.buildTypes.*
import Tiger0515.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0515")
    name = "Tiger0515"

    vcsRoot(Tiger0515_cVCSroot)

    buildType(Tiger0515_Hi1)
    buildType(Tiger0515_Hi0)
    buildType(Tiger0515_Hi3)
    buildType(Tiger0515_Hi2)
})

package Tiger0816

import Tiger0816.buildTypes.*
import Tiger0816.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0816")
    name = "Tiger0816"

    vcsRoot(Tiger0816_cVCSroot)

    buildType(Tiger0816_Hi2)
    buildType(Tiger0816_Hi3)
    buildType(Tiger0816_Hi0)
    buildType(Tiger0816_Hi1)
})

package Tiger0746

import Tiger0746.buildTypes.*
import Tiger0746.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0746")
    name = "Tiger0746"

    vcsRoot(Tiger0746_cVCSroot)

    buildType(Tiger0746_Hi2)
    buildType(Tiger0746_Hi3)
    buildType(Tiger0746_Hi0)
    buildType(Tiger0746_Hi1)
})
